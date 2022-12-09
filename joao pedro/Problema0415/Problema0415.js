const prompt = require("prompt-sync")({ sigint: true });

var numero1,numero2,numero3;

console.log("Digite tres numeros: ");
numero1=Number(prompt(""));
numero2=Number(prompt(""));
numero3=Number(prompt(""));
dobro(numero1,numero2,numero3);

function dobro(x1,x2,x3){
    x1=x1*2;
    x2=x2*2;
    x3=x3*2;
    console.log("Dobro dos valores: "+x1+", "+x2+", "+x3);
}