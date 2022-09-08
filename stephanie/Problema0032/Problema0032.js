const prompt = require("prompt-sync")({ sigint: true });

var tempCelsius = prompt("Digite a temperatura em Celsius: ")
var tempFahrenheit = 9.0/5.0 * tempCelsius + 32
console.log("Temperatura em Fahrenheit: "+tempFahrenheit)