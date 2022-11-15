const prompt = require("prompt-sync")({ sigint: true })

mensagem = prompt("Escreva uma mensagem: ")
console.log("\nMensagem original: "+mensagem)

mensagem = mensagem.replaceAll("a","x")
mensagem = mensagem.replaceAll("a","x")

mensagem = mensagem.replaceAll("e","y")
mensagem = mensagem.replaceAll("E","Y")

mensagem = mensagem.replaceAll("i","w")
mensagem = mensagem.replaceAll("I","W")

mensagem = mensagem.replaceAll("o","k")
mensagem = mensagem.replaceAll("O","K")

mensagem = mensagem.replaceAll("u","z")
mensagem = mensagem.replaceAll("U","Z")

console.log("\nMensagem criptografada: "+mensagem)