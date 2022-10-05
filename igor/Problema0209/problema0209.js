const prompt = require("prompt-sync")({ sigint: true });

var nTurma = prompt("Escreve numero turma: ")
var reprovado = 0

while( nTurma != "*") {

    nAula = parseInt(prompt("Escreve numero aula: "));
    
    nAluno = parseInt(prompt("Escreve numero aluno: "));

    for(var i =0; i<nAluno;i++){
        
        nFaltas = parseInt(prompt("Escreve numero faltas: "));

        var percentualFalta =(nFaltas*100)/nAula;

        if( percentualFalta > 25){
            reprovado = parseInt(reprovado+1);
        }
    }

    console.log(nTurma+": Numero reprovados: "+reprovado);
    var nTurma = prompt("Escreve numero turma: ")
   } 