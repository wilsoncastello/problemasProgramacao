const prompt = require("prompt-sync")({ sigvar: true });


function mediaSalarial(vetorSalario,  habitantes){
    var soma = 0
    var mediaSalarial = 0
    for(var i = 0; i < habitantes; i++){
        soma = soma + vetorSalario[i]
    }

    mediaSalarial = soma / habitantes

    return mediaSalarial
}

function retornaMaiorIdade(vetorIdade, habitantes){
    var maiorIdade = 0
    for(var i = 0; i < habitantes; i++){
        if(vetorIdade[i] > maiorIdade){
            maiorIdade = vetorIdade[i]
        }
    }

    return maiorIdade
}

function retornaMenorIdade(vetorIdade, habitantes){
    var menorIdade = 999
    for(var i = 0; i < habitantes; i++){
        if(vetorIdade[i] < menorIdade){
            menorIdade = vetorIdade[i]
        }
    }
    
    return menorIdade
}

function qtdHabitantesTresFilhos(vetorSalario, vetorFilhos, habitantes){
    var total = 0
    for(var i = 0; i < habitantes; i++){
        if(vetorSalario[i] <= 500 && vetorFilhos[i] == 3){
            total++
        }
    }
    
    return total
}


var habitantes = 10
var vetorIdade = [habitantes]
var vetorSalario = [habitantes]
var vetorFilhos = [habitantes]

for(var i = 0; i < habitantes; i++){
    vetorIdade[i] = parseInt(prompt("Digite a idade da pessoa ["+i+"]: "))
    vetorSalario[i] = parseFloat(prompt("Digite o salário da pessoa ["+i+"]: "))
    vetorFilhos[i] = parseInt(prompt("Digite a quantidade de filhos da pessoa ["+i+"]: "))
}

console.log(mediaSalarial(vetorSalario, habitantes))
console.log(retornaMaiorIdade(vetorIdade, habitantes))
console.log(retornaMenorIdade(vetorIdade, habitantes))
console.log(qtdHabitantesTresFilhos(vetorSalario, vetorFilhos, habitantes))