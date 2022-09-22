const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var cidade = prompt("Digite a cidade: ");
var aptos = parseInt(prompt("Digite o número de votos aptos: "));
var votos = parseInt(prompt("Digite o número de pessoas que votaram: "));
var candidato = parseInt(prompt("Digite o número de votos do candidato mais votado: "));


//Verificação de segundo turno e saída
console.log("Na cidade de" + cidade);
if (aptos > 200000 && candidato <= votos * 0.5) {
    console.log("Terá segundo turno");
}
else {
    console.log("Não terá segundo turno");
}