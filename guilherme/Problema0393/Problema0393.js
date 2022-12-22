const prompt = require("prompt-sync")({ sigint: true })

var soma1, soma2, soma3, crit1 = 0, crit2 = 0, crit3 = 0, v1 = -1, v2 = -1, v3 = -1
var alunos = []
var notas = [,]

for(let i = 0; i < 5; i++){
    console.log("\nDigite o nome do "+i+"º aluno: ")
    alunos[i] = prompt()
    soma1 = 0
    soma2 = 0
    soma3 = 0
    var maior1 = 0, maior2 = 0, k = 0, maior3 = 0, maior4 = 0
    for(let j = 0; j < 4; j++){
        if(j == 0)
            console.log("Digite a nota 1 do Primeiro Professor: ")
        else if(j == 1)
            console.log("Digite a nota 1 do Segundo Professor: ")
        else if(j == 2)
            console.log("Digite a nota 2 do Primeiro Professor: ")
        else
            console.log("Digite a nota 2 do Segundo Professor: ")
        notas[i,j] = Number(prompt())

        soma1 += notas[i,j]

        if(notas[i,j] > maior1){
            maior1 = notas[i,j]
            k = j
        }

        if(notas[i,j] > maior3 && j < 2)
            maior3 = notas[i,j]
        else if(notas[i,j] > maior4 && j > 1)
            maior4 = notas[i,j]
        soma3 = maior3 + maior4

    }

    if(crit1 < (soma1 / 4)){
        crit1 = soma1 / 4
        v1 = i
    }

    for(let j = 0; j < 4; j++){
        if(notas[i,j] > maior2 && j != k)
            maior2 = notas[i,j]
        soma2 = maior1 + maior2
    }
    if(crit2 < (soma2 / 2)){
        crit2 = soma2 / 2
        v2 = i
    }

    if(crit3 < (soma3 / 2)){
        crit3 = soma3 / 2
        v3 = i
    }
}

console.log("Vencedor Critério 1: " + alunos[v1])
console.log("Vencedor Critério 2: " + alunos[v2])
console.log("Vencedor Critério 3: " + alunos[v3])

if(v1 != v2 && v1 != v3){
    if(v1 > v2 && v1 > v3)
        console.log("Vencedor Geral:  "+ alunos[v1])
    else if(v2 > v1 && v2 > v3)
        console.log("Vencedor Geral:  "+ alunos[v2])
    else if(v3 > v1 && v3 > v2)
        console.log("Vencedor Geral:  "+ alunos[v2])
}
else if(v1 == v2)
    console.log("Vencedor Geral: " + alunos[v1])
else if(v2 == v3)
    console.log("Vencedor Geral: " + alunos[v2])
else if(v3 == v1)
    console.log("Vencedor Geral: " + alunos[v3])
