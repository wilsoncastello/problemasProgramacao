const prompt = require("prompt-sync")({ sigint: true });
var nome = prompt("Digite um nome: ");

while (nome.toUpperCase() != "FIM") {
  console.log(nome[0]);
  nome = prompt("Digite um nome: ");
}