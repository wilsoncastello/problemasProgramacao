const prompt = require("prompt-sync")({ sigint: true });

var n1,n2;

n1=Number(prompt("Digite um valor: "));
n2=Number(prompt("Digite um valor: "));

if (n1 > n2) {
     quadrado = n2 * n2;
     raiz = Math.sqrt(n1);
    console.log("O menor numero elevado ao quadrado: " + quadrado);
    console.log("A raiz quadrada do maior numero: " + raiz);

} else {
     quadrado = n1 * n1;
     raiz = Math.sqrt(n2);
     console.log("O menor numero elevado ao quadrado: " + quadrado);
     console.log("A raiz quadrada do maior numero: " + raiz);

}