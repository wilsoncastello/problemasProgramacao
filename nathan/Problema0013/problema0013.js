const prompt = require("prompt-sync")({ sigint: true });

let precoFabrica = Number(prompt("Digite o preço de fábrica do veículo: "));
let percDistribuidor = Number(prompt("Digite o percentual de lucro do distribuidor: "));
let percImposto = Number(prompt("Digite o percentual de impostos: "));

let lucroDistribuidor = (precoFabrica * percDistribuidor) / 100;
let valorImpostos = (precoFabrica * percImposto) / 100;
let precoFinal = (precoFabrica + lucroDistribuidor + valorImpostos);

console.log("Lucro do distribuidor: " + lucroDistribuidor);
console.log("Valor correspondente aos impostos: " + valorImpostos);
console.log("Preço final do veículo: " + precoFinal);