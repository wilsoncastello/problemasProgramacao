const prompt = require('prompt-sync')({ sigint: true });

let n = int(prompt("Digite um numero inteiro"));
let soma = 0;
let resto = 1;

while (resto>0){ 

    resto = n % 10;
    n = (n - resto) / 10;

    soma= soma + resto;
}

console.log("Soma dos alagarismos do numero: " +soma);
