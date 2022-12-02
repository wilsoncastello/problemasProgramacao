const prompt = require("prompt-sync")({sigint: true})

function calculo(num){
    fat = 1
    s = 0
    
    for(var i = 1; i<=num; i++){
        fat = fat * i
        s = s + 1/fat 
        
        if(i == 1){
            s = s + 1
        }
    }
    
    return s
}

num = Number(prompt("Digite um numero inteiro: "))
numFim = calculo(num)

console.log("Número final: "+numFim)
