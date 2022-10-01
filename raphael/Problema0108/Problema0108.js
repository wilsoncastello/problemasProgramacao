const prompt = require("prompt-sync")({ sigint: true });

/*Faça um programa que receba a idade de uma pessoa e mostre a mensagem de maioridade (igual ou superior a 18 anos) ou não. */

idade = Number(prompt("Digite a idade de uma pessoa: "));

if(idade < 18) {
    console.log("A pessoa não é maior de idade");
}
else {
    console.log("A pessoa é maior de idade");
}