//Implementar um algoritmo para calcular o valor de e^X O valor de X devera ser digitado. O valor de e^X será calculado pela soma dos 10 primeiros termos da serie a seguir: e^x = 1 + x + x^2/2! + x^3/3! + ...   

const prompt = require('prompt-sync')({ sigint: true });

let x = parseFloat(prompt("Digite o valor de x: "));

let soma = 0;
let fat = 1;

for (let i = 0; i<10; i++){
    j = i;
    
    if(i>0){
      fat = i;
    }

    while(i > 1){
      fat = fat * (i-1);
      i--;
    }

    i= j;

    soma = soma + (x**i)/fat;
}
    
console.log("e^x = " + soma);