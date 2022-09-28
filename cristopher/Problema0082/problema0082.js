const prompt = require("prompt-sync")({ sigint: true });

var numero1 = parseInt(prompt("Digite o primeiro número: "))
var numero2 = parseInt(prompt("Digite o segundo número: "))

if(numero1 % numero2 == 0 || numero2 % numero1 == 0){
    console.log("São múltiplos.")

}else{
    console.log("Não são múltiplos.")
}