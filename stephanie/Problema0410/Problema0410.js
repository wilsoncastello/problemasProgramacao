const prompt = require("prompt-sync")({ sigint: true })

function calculaFatorial(a){
    let n, fat=1;
    for(let i=0; i<a.size(); i++){
        n = a[i];
        for (i=1;i<=n;i++){
            fat = fat*i;
        }
        b[i] = fat;
    }
    return b;
}

let a = [];
let b = [];
for(let i=0; i<5;i++){
    a[i] = prompt("Digite um número inteiro par calcular o fatorial: ");
}
b = calculaFatorial(a);
console.log("Vetor resultado")
for(let i=0; i<5;i++){
    console.log(b[i]);
}