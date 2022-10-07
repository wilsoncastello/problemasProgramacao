const prompt = require("prompt-sync")({ sigint: true });

var limiteInferior = parseInt(prompt("Digite o limite inferior:"));
var limiteSuperior = parseInt(prompt("Digite o limite superior:"));
var decremento = parseInt(prompt("Digite o valor do decremento:"));
for (grausCelsius = limiteSuperior; grausCelsius > limiteInferior; grausCelsius = grausCelsius - decremento){
    grausFahrenheit = (grausCelsius * 9 / 5) + 32;
    console.log("Graus Celsius: "+grausCelsius+"             Graus Fahrenheit: "+grausFahrenheit);  
}