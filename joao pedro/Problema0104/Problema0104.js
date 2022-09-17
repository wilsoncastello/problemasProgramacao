const prompt = require("prompt-sync")({ sigint: true });

var n1,n2,n3,n4;

console.log("Digite 3 numeros em ordem crescente (Sem repeticoes):");
n1=Number(prompt("Numero 1: "));
n2=Number(prompt("Numero 2: "));
n3=Number(prompt("Numero 3: "));
console.log("Digite um numero (Sem repetir os anteriores): ");
n4=Number(prompt("Numero 4: "));

if (n4 > n3) {
    console.log("Numeros em ordem decrescente: " + n4 + " , " + n3 + " , " + n2 + " , " + n1);

} else {
    if (n3 > n4 && n4 > n2) {
        console.log("Numeros em ordem decrescente: " + n3 + " , " + n4 + " , " + n2 + " , " + n1);

    } else {
        if (n3 > n4 && n2 > n4 && n4 > n1) {
            console.log("Numeros em ordem decrescente: " + n3 + " , " + n2 + " , " + n4 + " , " + n1);
            
        } else {
            console.log("Numeros em ordem decrescente: " + n3 + " , " + n2 + " , " + n1 + " , " + n4);

        }

    }

}