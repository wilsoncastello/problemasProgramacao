const prompt = require("prompt-sync")({ sigint: true })

var a = prompt("Digite A: ")
var b = prompt("Digite B: ")
var c = prompt("Digite C: ")

if( (a > b) && (a > c) ) {

    console.log("'A' é o maior número.");

} else {

    if( (b > a) && (b > c) ) {

        console.log("'B' é o maior número.");

    } else {

        console.log("'C' é o maior número.");

    }
}