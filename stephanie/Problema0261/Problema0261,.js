const prompt = require("prompt-sync")({ sigint: true })

var modelos = []
var consumo = []
var modeloEconomico;
var litrosCombustivel, maisEconomico=1000;

for(let i = 0; i < 5; i++){
    modelos[i] = prompt("Digite o modelo do carro "+i+": ")
}
for(let i = 0; i < 10; i++){
    b[i] = Number(prompt("Digite o consumo do carro "+i+": "))
}
for (let i=0;i<5;i++){
    if(consumo[i]<maisEconomico){
        modeloEconomico = modelos[i]
    }
}
console.log("Modelo mais econômico:"+modeloEconomico)
console.log("Quantos litros de combustível cada um dos carros cadastrados "+ 
        "consome para percorrer uma distância de 1.000 km:")
for (let i=0;i<10;i++){
    litrosCombustivel = consumo[i]*1000;
    console.log(modelos[i]+":"+litrosCombustivel)
}
