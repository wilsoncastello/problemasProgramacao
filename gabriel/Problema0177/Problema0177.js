var valor = parseInt(prompt("Digite valores inteiros e positivos (quando desejar encerrar o programa digite '0')"));

var maior = 0;
var menor = 299999999;

while (valor != 0) {
  
    if (valor < 0) {
        console.log("Os valores negativos ou iguais a zero não entrarão nos cálculos");
    }

    else{
  
        if (valor > maior) {
            maior = valor;
        } 

        if (valor < menor) {
            menor = valor;
  
        }

    }

    valor = prompt("Digite outro valor: ");

}

console.log("Maior valor digitado: " + maior);
console.log("Menor valor digitado: " + menor);