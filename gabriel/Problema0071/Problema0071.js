//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem de lucro do revendedor e com o custo dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do revendedor seja de 25% e que os impostos custam 45% do custo de fábrica, faça um algoritmo para determinar o preço final do automóvel (custo ao consumidor).

const prompt = require('prompt-sync')({ sigint: true });

//entrada
let custoFabrica = parseFloat(prompt("Digite o preço de fábrica do veículo: "));

//cálculo
let precoVenda = (custoFabrica) + (custoFabrica * 0.25) + (custoFabrica * 0.45);

//saída
console.log("Preço Final ao consumidor: " + precoVenda);
