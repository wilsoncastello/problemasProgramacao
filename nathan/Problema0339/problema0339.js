const prompt = require("prompt-sync")({ sigint: true });
var frase = prompt("Digite uma frase para ver o inverso: ");

for(i = frase.length-1; i >= 0; i--){
    process.stdout.write(frase[i]);
}