const prompt = require("prompt-sync")({ sigvar: true });

const frase = prompt("Digite uma frase contendo um numero: ")
vetorFrase = frase.split('')

var posicaoNum = 0

for(var i = 0; i < frase.length; i++){
    if(vetorFrase[i] == '0' || vetorFrase[i] == '1' || vetorFrase[i] == '2' || vetorFrase[i] == '3' || vetorFrase[i] == '4' || vetorFrase[i] == '5' || vetorFrase[i] == '6' || vetorFrase[i] == '7' || vetorFrase[i] == '8' || vetorFrase[i] == '9'){
        posicaoNum = vetorFrase[i]
    }
}

for(var i = 0; i < frase.length; i++){
    if(vetorFrase[i] == posicaoNum){
        if(vetorFrase[i] == '0')
            console.log("zero");
        else if(vetorFrase[i] == '1')
            console.log("um");
        else if(vetorFrase[i] == '2')
            console.log("dois");
        else if(vetorFrase[i] == '3')
            console.log("tres");
        else if(vetorFrase[i] == '4')
            console.log("quatro");
        else if(vetorFrase[i] == '5')
            console.log("cinco");
        else if(vetorFrase[i] == '6')
            console.log("seis");
        else if(vetorFrase[i] == '7')
            console.log("sete");
        else if(vetorFrase[i] == '8')
            console.log("oito");
        else if(vetorFrase[i] == '9')
            console.log("nove");
        }
    else{
        console.log(vetorFrase[i]);
    }
}