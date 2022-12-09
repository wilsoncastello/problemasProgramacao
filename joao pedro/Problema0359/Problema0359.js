const prompt = require("prompt-sync")({ sigint: true });

var nomes=[],sala120="",sala121="",sala122="";

console.log("Lista de alunos (Digite '#' para concluir a lista): ");
i=0
while (nomes[i]!="#"){
            
    nomes[i]=prompt("Nome do aluno "+i+": ");
    
    if(nomes[i]=="#"){
        break;
    }
    if(nomes[i].charAt(0)>='A' && nomes[i].charAt(0)<='K'){
        sala120=nomes[i]+"  "+sala120;
    }
    if(nomes[i].charAt(0)>='L' && nomes[i].charAt(0)<='N'){
        sala121=nomes[i]+"  "+sala121;
    }
    if(nomes[i].charAt(0)>='O' && nomes[i].charAt(0)<='Z'){
        sala122=nomes[i]+"  "+sala122;
    }
   i++;
}
console.log("Alunos da sala 120: "+sala120);
console.log("Alunos da sala 121: "+sala121);
console.log("Alunos da sala 122: "+sala122);