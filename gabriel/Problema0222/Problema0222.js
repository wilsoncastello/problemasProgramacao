const prompt = require('prompt-sync')({ sigint: true });

let n = parseInt(prompt("Digite um numero inteiro positivo: "));
primo = true;

for(let i=2; i<n; i++){
    if(n % i == 0){
        primo = false;
    }
}

if(n <= 0){
    primo = false;
}

if(primo == true){
    console.log("O numero " + n + " é primo");
}

else{
    console.log("O numero " + n + " não é primo");
}