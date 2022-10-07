const prompt = require("prompt-sync")({ sigint: true });

var numeroSequencia = 8;
var elementoControle = 0;
var n = parseInt(prompt("Digite um número inteiro:"));
console.log(numeroSequencia);
while(numeroSequencia < n && elementoControle < n){
    var numeroSequenciaSoma = numeroSequencia + 2;
    console.log(numeroSequenciaSoma);
    numeroSequenciaMultiplicacao = numeroSequencia * 2;
    console.log(numeroSequenciaMultiplicacao);
    numeroSequencia = numeroSequenciaMultiplicacao;
    elementoControle = numeroSequencia * 2;
}