const prompt = require("prompt-sync")({ sigint: true });

var angulo = parseInt(prompt("Informe o angulo (em graus): "))

var altura = parseFloat(prompt("Digite a altura da parede: "))

var radianos = (angulo * 3.14) / 180

var escada = altura / Math.sin(radianos)

console.log("Medida da escada: " + escada)