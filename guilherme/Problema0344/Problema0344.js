const prompt = require("prompt-sync")({ sigint: true })

var nome, nomeAbreviado = "", ultimoEspaco = 0
nome = prompt("Digite um nome: ")
nomeAbreviado = nome.substring(0, nome.indexOf(" "))

for(let i = 0; i < nome.length; i++)
    if(nome.charAt(i) == ' ')
        ultimoEspaco = i
for(let i = 0; i < nome.length; i++){
    if(nome.charAt(i) == ' ' && i != ultimoEspaco)
        nomeAbreviado += nome.substring(i,i+2).toUpperCase().concat(".")
}
nomeAbreviado += nome.substring(ultimoEspaco)
console.log(nomeAbreviado)