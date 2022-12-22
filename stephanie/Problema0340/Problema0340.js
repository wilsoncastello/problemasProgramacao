const prompt = require("prompt-sync")({ sigint: true })
let original = prompt("Digite uma frase: ")
let invertida = ""

for (var i = original.length() - 1;  0 <= i; i--) {
    invertida += original.charAt(i);
}
System.out.println("Frase invertida: " + invertida);

