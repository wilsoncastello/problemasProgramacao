const prompt = require("prompt-sync")({ sigint: true });

var numero = parseFloat(prompt("Informe um número qualquer: "))

if(numero > 0){
    console.log("Imprimindo a raiz do número: " + Math.sqrt(numero))
}else{
    console.log("Imprimindo o quadrado do número: " + Math.pow(numero, 2))
}