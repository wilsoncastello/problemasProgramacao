const prompt = require("prompt-sync")({sigint: true})

var txt, txt2

txt = prompt("Digite uma frase: ");

if(txt.includes("aluno") || txt.includes("escola")){
    if(txt.includes("aluno") && txt.includes("escola")){
        txt2 = txt.replace("aluno", "estudante");
        console.log("Nova Frase: "+txt2.replace("escola", "universidade"));
    }
    else{
        if(txt.includes("aluno")){
            txt2 = txt.replace("aluno", "estudante");
            console.log("Nova Frase: "+txt2);
        }
        else{
            txt2 = txt.replace("escola", "universidade");
            console.log("Nova Frase: "+txt2);
        }
    }
}
else{
    System.out.println("Frase continua igual: "+txt);
}