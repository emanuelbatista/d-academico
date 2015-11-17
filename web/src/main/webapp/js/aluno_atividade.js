var idBoard = "56489937e84b54c1a6fb320d";
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
    $('#list>tbody').children().remove();
    Trello.get("/lists/" + idList + "/cards", function (dado) {
        for (i = 0; i < dado.length; i++) {
            var tr = $(document.createElement("tr"));
            tr.appendTo("#list>tbody");
            addTd(tr, dado[i].name);
            addTd(tr, dado[i].desc);
            addTd(tr,new Date(dado[i].due).toLocaleDateString());
            addTurma(tr, dado[i].idList);
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





AuthenticateTrello();
listarList();