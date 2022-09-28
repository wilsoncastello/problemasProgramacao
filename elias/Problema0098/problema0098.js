const prompt = require("prompt-sync")({ sigint: true });

var h = parseFloat(prompt("Digite sua altura:"));
var genero = prompt("Digite se gênero:");
if(genero == 'M' || genero == 'm'){
    pesoIdeal = 72.7 * h - 58;
    console.log("Seu peso ideal é: "+pesoIdeal);
}
else if (genero == 'F' || genero == 'f'){
    pesoIdeal = 62.1 * h - 44.7;
    console.log("Seu peso ideal é: "+pesoIdeal);
}
else
    console.log("Gênero inválido, tente novamente!");