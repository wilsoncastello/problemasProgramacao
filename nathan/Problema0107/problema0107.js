const prompt = require("prompt-sync")({ sigint: true });
var senha = Number(prompt("Digite a senha: "));
if(senha == 4531)
    console.log("Acesso permitido");
else
    console.log("Acesso negado");