const prompt = require("prompt-sync")({ sigint: true });

var numeroCanal = 1;
var qtdPessoasAssistindo4 = 0, qtdPessoasAssistindo5 = 0, qtdPessoasAssistindo7 = 0, qtdPessoasAssistindo12 = 0;
var somaCanal4 = 0, somaCanal5 = 0, somaCanal7 = 0, somaCanal12 = 0;

while(numeroCanal != 0){
    numeroCanal = parseInt(prompt("Digite o número do canal: "))
    if(numeroCanal == 4){
        qtdPessoasAssistindo4 = parseInt(prompt("Informe a quantidade de pessoas assistindo a esse canal: "))
        somaCanal4 = somaCanal4 + qtdPessoasAssistindo4
    }else if(numeroCanal == 5){
        qtdPessoasAssistindo5 = parseInt(prompt("Informe a quantidade de pessoas assistindo a esse canal: "))
        somaCanal5 = somaCanal5 + qtdPessoasAssistindo5
    }else if(numeroCanal == 7){
        qtdPessoasAssistindo7 = parseInt(prompt("Informe a quantidade de pessoas assistindo a esse canal: "))
        somaCanal7 = somaCanal7 + qtdPessoasAssistindo7
    }else if(numeroCanal == 12){
        qtdPessoasAssistindo12 = parseInt(prompt("Informe a quantidade de pessoas assistindo a esse canal: "))
        somaCanal12 = somaCanal12 + qtdPessoasAssistindo12
    }else{
        console.log("Número do canal inválido.");
    }

    }

var quantidadeTotalEspectadores = somaCanal4 + somaCanal5 + somaCanal7 + somaCanal12;
var percentualCanal4 = (somaCanal4 * 100) / quantidadeTotalEspectadores;
var percentualCanal5 = (somaCanal5 * 100) / quantidadeTotalEspectadores;
var percentualCanal7 = (somaCanal7 * 100) / quantidadeTotalEspectadores;
var percentualCanal12 = (somaCanal12 * 100) / quantidadeTotalEspectadores;

console.log("Total de pessoas assistindo ao canal 4: " + somaCanal4);
console.log("Percentual de audiência do canal 4: " + percentualCanal4  + "(%)");
console.log();
console.log("Total de pessoas assistindo ao canal 5: " + somaCanal5);
console.log("Percentual de audiência do canal 5: " + percentualCanal5  + "(%)");
console.log();
console.log("Total de pessoas assistindo ao canal 7: " + somaCanal7);
console.log("Percentual de audiência do canal 7: " + percentualCanal7  + "(%)");
console.log();
console.log("Total de pessoas assistindo ao canal 12: " + somaCanal12);
console.log("Percentual de audiência do canal 12: " + percentualCanal12  + "(%)");