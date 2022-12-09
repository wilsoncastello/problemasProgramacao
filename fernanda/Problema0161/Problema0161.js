const prompt = require("prompt-sync")({ sigint: true });

do{
    var numero = prompt("Digite um número: ")
}while (numero <= 0);
for(var i = 0; i <= 10; i++){
    console.log(numero +" x "+ i +" = "+ numero*i)
}