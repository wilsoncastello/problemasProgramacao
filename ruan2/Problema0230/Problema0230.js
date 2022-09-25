const prompt = require("prompt-sync")({sigint: true})

/*Dados N pares de pontos do tipo A ( x1, y1 ) e B ( x2 , y2 ) , faça um algoritmo que : 
a ) Para cada par , calcule e mostre a distância entre os pontos ; 
b ) Calcule e mostre a soma das distâncias menores que 10.0 ; 
c ) Determine e mostre a quantidade de pares cuja distância está entre 10.0 e 18.0 ( inclusive extremos ) ; 
d ) Forneça o valor da maior distância .*/

var x1, y1, x2, y2
var quantP, dp
var somaD = 0, contPares1018 = 0
var dMaior = 0

quantP = prompt("Digite a quantidade de pares de pontos: ")

for (var i = 0; i < quantP; i++) {
    console.log("Digite as coordenadas do ponto "+(i+i))
    x1 = Number(prompt("Digite o x: "))
    y1 = Number(prompt("Digite o y: "))
    console.log("")
    console.log("Digite as coordenadas do ponto "+(i+i+1))
    x2 = Number(prompt("Digite o x: "))
    y2 = Number(prompt("Digite o y: "))
    console.log("")

    dp = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
    
    console.log("Distancia entre o Ponto "+i+" e "+(i+1)+": "+dp)

    if(dp < 10){
        somaD = somaD + dp
    }
    else{
        if(dp >= 10 && dp <= 18){
            contPares1018++
        }
    }

    if(dp > dMaior){
        dMaior = dp
    }
}

console.log("")
console.log("Soma das distâncias menores que 10: "+somaD)
console.log("Quantidade de pares cuja distância está entre 10 e 18: "+contPares1018)
console.log("Valor da maior distância: "+dMaior)



