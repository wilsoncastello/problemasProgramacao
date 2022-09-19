const prompt = require("prompt-sync")({ sigint: true });

var a = parseFloat(prompt("Informe o primeiro valor: "))
var b = parseFloat(prompt("Informe o segundo valor: "))
var c = parseFloat(prompt("Informe o terceiro valor: "))

ehTriangulo = false;

    //Condições para ser um triângulo
    if(a > 0 && b > 0 && c > 0){
        if(a < (b + c) && b < (a + c) && c < (a + b)){
                ehTriangulo = true;
        }else{
            console.log("Não é um triângulo.")
        }
    }else{
        console.log("Não é um triângulo.");
    }

    if(ehTriangulo == true && a == b && a == c){
        console.log("É um triângulo equilátero.");

    }else if(ehTriangulo == true && a == b || b == c || a == c){
        console.log("É um triângulo isósceles.");

    }else if(ehTriangulo == true && a != b && b != c && a != c){
        console.log("É um triângulo escaleno.");
    }