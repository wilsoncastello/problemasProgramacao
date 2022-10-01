const prompt = require("prompt-sync")({ sigint: true });

var altura=0,peso=0,altura1020=0,pesoInferior=0,mediaAlturas=0,porcentagem=0,idade=0,pessoaMaior50=0,idade1020=0;
for(i=0;i<5;i++){
altura=Number(prompt("Digite a altura da pessoa "+i+": "));
peso=Number(prompt("Digite o peso da pessoa "+i+": "));
idade=Number(prompt("Digite a idade da pessoa "+i+": "));

if(idade>=10 && idade<=20){
    altura1020=altura+altura1020;
    idade1020++;
}
if(idade>50){
    pessoaMaior50++;


}
if(peso<40){
    pesoInferior++;
}




}

        mediaAlturas=altura1020/idade1020;
        porcentagem=(pesoInferior*100)/5;
        console.log("A quantiade de pessoas com idade superior a 50 anos: "+pessoaMaior50);
        console.log("A media das alturas das pessoas com idade entre 10 e 20 anos: "+mediaAlturas);
        console.log("A porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analizadas: "+porcentagem);