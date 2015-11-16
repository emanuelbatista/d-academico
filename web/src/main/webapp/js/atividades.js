var idBoard="56489937e84b54c1a6fb320d";
function AuthenticateTrello() {
  Trello.authorize({
    name: "D-Academico",
    type: "redirect",
    expiration: "never",
    scope: { write: true, read: true }
  });
}
AuthenticateTrello();

function criarCard(){
    Trello.post("/1/boards/"+idBoard+"/lists",{name: $('#turmaId').val(),pos:"top"}, function(){
        
    });
}