const prompt = require("prompt-sync")({ sigint: true })

var j
var logica = [15];
var linguagemProgramacao = [10];
for(let i = 0; i < 15; i++)
    logica[i] = Number(prompt("Digite uma matricula da turma de Lógica: "))
for(let i = 0; i < 10; i++)
    linguagemProgramacao[i] = Number(prompt("Digite uma matricula da turma de Linguagem de Programação: "))
for(let i = 0; i < 15; i++){
    j = 0;
    while(j != 10)
    if(logica[i] == linguagemProgramacao[j]){
        console.log("Número de matrícula matrículado nos dois cursos: " + logica[i])
        j++
    }
    else{
        j++
    }
}