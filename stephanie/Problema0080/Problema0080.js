const prompt = require("prompt-sync")({ sigint: true });

var f = prompt("Digite a temperatura em Fahrenheit: ")
var c = ((f - 32)*5)/9
console.log("Temperatura em Celsius: "+c)