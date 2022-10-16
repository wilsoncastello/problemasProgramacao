const prompt = require("prompt-sync")({ sigint: true });

var x = prompt("Escreve o dividendo: ")
var y = prompt("Escreve o divisor: ")

var z = x/y
var w = x%y
var t = parseInt(z)

console.log("Dividendo: "+x)
console.log("Divisor: "+y)
console.log("Quociente: "+t)
console.log("Resto: "+w)