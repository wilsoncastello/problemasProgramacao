const prompt = require("prompt-sync")({ sigint: true });
var verbo = prompt("Digite um verbo regular que termina com 'ar' para ver suas conjugações: ");
console.log("Verbo: " + verbo)
console.log("Eu " + verbo.substring(0, verbo.length - 2) + "o");
console.log("Tu " + verbo.substring(0, verbo.length - 2) + "as");
console.log("Ele " + verbo.substring(0, verbo.length - 2) + "a");
console.log("Ela " + verbo.substring(0, verbo.length - 2) + "a");
console.log("Nós " + verbo.substring(0, verbo.length - 2) + "amos");
console.log("Vós " + verbo.substring(0, verbo.length - 2) + "ais");
console.log("Elas " + verbo.substring(0, verbo.length - 2) + "am");