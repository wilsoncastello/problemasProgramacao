const prompt = require("prompt-sync")({ sigint: true });
var contPrimo = 0;
for(i = 0; i < 10; i++){
    var n = Number(prompt("Digite o " + (i+1) + "° número: "));
    if(n % 2 == 0 || n % 3 == 0){
        if(n == 2 || n == 3)
            contPrimo++;
    }else
        contPrimo++;
}
console.log("Quantidade de números primos: " + contPrimo);