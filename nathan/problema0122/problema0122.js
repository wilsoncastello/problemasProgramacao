const prompt = require("prompt-sync")({ sigint: true });
var valor = Number(prompt("Valor a ser convertido: "));
var codigo = prompt("Digite o código da moeda a ser convertido(L-Libra, D-Dolar, E-Euro): ");

var valorConvertido = 0;

if(codigo =='L'){
    valorConvertido = valor * 0.17;
    console.log("Valor informado: " + valor);
    console.log("Valor convertido em " + codigo + ": " + valorConvertido);
}else if(codigo == 'D'){
    valorConvertido = valor * 0.19;
    console.log("Valor informado: " + valor);
    console.log("Valor convertido em " + codigo + ": " + valorConvertido);
}else if(codigo == 'E'){
    valorConvertido = valor * 0.19;
    console.log("Valor informado: " + valor);
    console.log("Valor convertido em " + codigo + ": " + valorConvertido);
}else{
    console.log("Codigo invalido");
}