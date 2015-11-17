var idBoard = "564afec5c742faeb34c046c9";
var token="a90c3c4fd2062571b2a3db5b39c10a81402702aedb563ead9aefe13fa3b74ec8";
function AuthenticateTrello() {
    Trello.authorize({
        name: "D-Academico",
        type: "redirect",
        expiration: "never",
        scope: {write: true, read: true}
    });
}


function listarList() {
    Trello.get("/boards/" + idBoard + "/lists", function (dado) {
        for (i = 0; i < dado.length; i++) {
            var options = $('#turmaId').children('option');
            for (f = 0; f < options.length; f++) {
                if (options[f].value === dado[i].name) {
                    listarCardList(dado[i].id);
                }
            }
        }
    }, function () {
        console.log("Erro");
    });
}


function listarCardList(idList) {
    Trello.get("/lists/" + idList + "/cards", function (dado) {
        for (i = 0; i < dado.length; i++) {
            var tr = $(document.createElement("tr"));
            tr.appendTo("#list>tbody");
            addTd(tr, dado[i].name);
            addTd(tr, dado[i].desc);
            addTd(tr,new Date(dado[i].due).toLocaleDateString());
            addTurma(tr, dado[i].idList);
            var td = $(document.createElement("td"));
            var button = $(document.createElement("button"));
            button.html("Remover");
            button.addClass("btn btn-danger");
            button.attr({"onclick": "removerCard(this,'" + dado[i].id + "')"});
            button.appendTo(td);
            td.appendTo(tr);
        }
    });
   
}



function addTd(tr, html) {
    var td = $(document.createElement("td"));
    td.html(html);
    td.appendTo(tr);
}

function addTurma(tr, idList) {
    var options = $('#turmaId').children('option');
    var td = $(document.createElement("td"));
    Trello.get("/lists/" + idList, function (list) {
        for (i = 0; i < options.length; i++) {
            if (options[i].value === list.name) {
                td.html(options[i].innerHTML);
                td.appendTo(tr);
            }
        }
    });

}

function criarCard() {
    var turma_ = $('#turmaId');
    Trello.get("/boards/" + idBoard + "/lists", function (dado) {
        var turma = $('#turmaId');
        var contem = false;
        var idList = "";
        for (i = 0; i < dado.length; i++) {
            if (dado[i].name === turma.val()) {
                contem = true;
                idList = dado[i].id;
                break;
            }
        }
        if (!contem) {
            criarList();
            sleep(300);
            criarCard();
            
        } else {
            console.log($('#data').val());
            Trello.post("/cards", {name: $('#title').val(), due: $('#data').val(),desc: $("#descricao").val() ,idList: idList}, function () {
                console.log("Funfou");
            });
        }
        listarList();
        $('#adduvida').modal('hide');
         location.reload();

    });

}

function sleep(milliseconds) {
    var start = new Date().getTime();
    for (var i = 0; i < 1e7; i++) {
        if ((new Date().getTime() - start) > milliseconds) {
            break;
        }
    }
}

function criarList() {
    Trello.post("/boards/" + idBoard + "/lists", {name: $('#turmaId').val(), pos: "top"}, function () {
        console.log("Salvou");
    }, function () {
        console.log("List Erro");
    });
}


function removerCard(element, idCard) {
    Trello.delete("/cards/" + idCard, function () {

        $(element).parent().parent().remove();
    });


}


AuthenticateTrello();
Trello.setToken(token);
listarList();