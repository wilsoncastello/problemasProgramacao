const prompt = require("prompt-sync")({ sigint: true });

/*Crie um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral:
* não-eleitor (abaixo de 16 anos)
* eleitor obrigatório (entre 18 e 65 anos)
* eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)*/

idade = Number(prompt("Digite a idade de uma pessoa: "));

if (idade < 16) {
    console.log("classe eleitoral: não eleitor");
} else if (idade > 17 && idade < 66) {
    console.log("classe eleitoral: eleitor obrigatório");
} else {
    console.log("classe eleitoral: eleitor facultativo");
}