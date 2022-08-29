const prompt = require("prompt-sync")({ sigint: true});
let cm = prompt("Digite o raio do círculo em cm: ")

let area = Math.PI * parseFloat(cm)**2

console.log("A área deste círculo é de: "+area) 