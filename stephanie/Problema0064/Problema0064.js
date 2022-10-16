const prompt = require("prompt-sync")({ sigint: true });

var n = prompt("Quantos quilos de café você comprou? ")
var q = prompt("Qual era o valor unitário do café? ")
var l = prompt("Quantos litros de leite você comprou? ")
var p = prompt("Qual era o valor unitário do leite? ")
var b = prompt("Quantos quilos de banana você comprou? ")
var t = prompt("Qual era o valor unitário da banana? ")

var nq = n * q
var lp = l * p
var bt = b * t
var total = nq + lp + bt

console.log("")
console.log("Total gasto com café: ",nq)
console.log("Total gasto com leite: ",lp)
console.log("Total gasto com banana: ",bt)
console.log("")
console.log("Total gasto: ",total)