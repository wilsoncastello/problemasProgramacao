const prompt = require("prompt-sync")({ sigint: true });

var base8 = prompt("Escreve numero base 8: ");

while(base8 != "*") {
    console.log("Base 8: "+base8);

    var base10 = parseInt(base8, 8)
    console.log("Base 10: "+base10);

    var base8 = prompt("Escreve numero base 8: ");
}
