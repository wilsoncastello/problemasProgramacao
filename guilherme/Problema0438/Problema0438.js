const prompt = require("prompt-sync")({ sigint: true })

function triangulo(a, b, c){
    var x = 0
    if(a + b > c && a + c > b && b + c > a){
        if(a == b && b == c)
            x = 1
        else if(a == b && b != c || a == c && a != b || b == c && c != a)
            x = 2
        else if(a != b && a != c && b != c)
            x = 3
    }
    return x
}

var a, b, c 
console.log("Digite o primeiro lado: ") 
a = Number(prompt()) 
console.log("Digite o segundo lado: ") 
b = Number(prompt()) 
console.log("Digite o terceiro lado: ") 
c = Number(prompt()) 
if(triangulo(a, b, c) == 0)
    console.log("Não é um triângulo!") 
else if(triangulo(a, b, c) == 1)
    console.log("Triângulo Equilátero!") 
else if(triangulo(a, b, c) == 2)
    console.log("Triângulo Isóceles!") 
else if(triangulo(a, b, c) == 3)
    console.log("Triângulo Escaleno!") 