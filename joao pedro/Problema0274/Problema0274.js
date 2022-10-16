const prompt = require("prompt-sync")({ sigint: true });

var numero=0,positivo=0,negativo=0;

console.log("--Digite 10 numeros--");

for(i=0;i<10;i++){
    numero=Number(prompt("Digite um valor para o numero de posicao "+i+": "));
    
    if(numero>0){
        positivo=positivo+numero;
    } else {
        negativo++;

    }


}
console.log("A soma de todos os numeros positivos: "+positivo);
console.log("A quantidade de numeros negativos: "+negativo);
