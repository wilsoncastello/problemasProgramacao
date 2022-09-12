const prompt = require("prompt-sync")({ sigint: true });

var diaAtual = prompt("Escreve o numero do dia atual: ")
var mesAtual = prompt("Escreve o numero do mes atual: ")
var anoAtual = prompt("Escreve o numero do ano atual: ")

var dia = prompt("Escreve o numero do dia: ")
var mes = prompt("Escreve o numero do mes: ")
var ano = prompt("Escreve o numero do ano: ")

if(anoAtual < ano){
    console.log("Nao esta vencida");
}else if(anoAtual > ano){
    console.log("Esta vencida");
}else{
    if(mesAtual < mes){
        console.log("Nao esta vencida");
    }else if(mesAtual > mes){
        console.log("Esta vencida");
    }else{
        if(diaAtual <= dia){
            console.log("Nao esta vencida");
        }else {
            console.log("Esta vencida");
        }
    }
}