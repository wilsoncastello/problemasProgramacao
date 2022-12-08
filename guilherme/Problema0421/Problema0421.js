const prompt = require("prompt-sync")({ sigint: true })

function primo(n){
    var ehPrimo = true;
    for(let i = 2; i < n; i++){
        if(n % i == 0){
            ehPrimo = false;
        }
    } 
    if(ehPrimo == false){
        console.log("O número "+n+" não é primo!");
    }else{
        console.log("O número "+n+" é primo!");
    }
}

var n = Number(prompt("Digite um número: "))
primo(n)