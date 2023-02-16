const prompt = require("prompt-sync")({ sigint: true });

var nome=[],x=0,digite;

for(i=0;i<5;i++){
    nome[i]=String(prompt("Digite um nome de posicao "+i+": "));
    
    }
    digite=String(prompt("Digite mais um nome: "));
   
    for(i=0;i<5;i++){
     if(digite==nome[i]){
         console.log("O mesmo nome e encontrado na posicao: "+i);
         x=1;
     }
     
    }

    if(x==0){
     console.log("Nome nao encontrado");
    }




