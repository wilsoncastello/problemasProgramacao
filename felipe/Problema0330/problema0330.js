const prompt = require("prompt-sync")({ sigint: true })

const frase = prompt("Digite uma frase: ")
const words = frase.split(" ").length

console.log("Número de palavras nessa frase: ",words)