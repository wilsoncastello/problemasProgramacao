const prompt = require("prompt-sync")({ sigint: true })

var frase
var x
var cont = 0
frase = prompt("Digite uma frase: ")
x = prompt("Digite um caractere para buscar na frase: ")
for(let i = 0; i < frase.length; i++){
    if(frase.charAt(i) == x)
        cont++
}
if(cont == 1){
    console.log("\'" + x + "\' é encontrado na frase.");
    console.log("É encontrado na posição: ");
    for(let i = 0; i < frase.length; i++){
        if(frase.charAt(i) == x)
            console.log(i + "; ");
    }
}else if(cont > 1){
    console.log("\'" + x + "\' é encontrado na frase " + cont + " vezes.");
    console.log("Pode se encontrado nas posições: ");
    for(let i = 0; i < frase.length; i++){
        if(frase.charAt(i) == x)
            console.log(i + "; ");    
    }
}else{
    console.log("\'" + x + "\' não pode ser encontrado na frase.")
}