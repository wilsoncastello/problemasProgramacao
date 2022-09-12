const prompt = require("prompt-sync")({ sigint: true });

var peso,pesoAumentado,pesoReduzido;

peso=Number(prompt("Digite seu peso: "));
pesoAumentado=peso*1.15;
pesoReduzido=peso*0.8;

console.log("Peso aumentado em 15%: "+pesoAumentado);
console.log("Peso reduzido em 20%: "+pesoReduzido);
