const prompt = require("prompt-sync")({ sigint: true });

var angulo1 = parseFloat(prompt("Digite a medida do primeiro ângulo: "));
var angulo2 = parseFloat(prompt("Digite a medida do segundo ângulo: "));
var angulo3 = 180 - angulo1 - angulo2;
console.log("A medida do terceiro ângulo é: " + angulo3);