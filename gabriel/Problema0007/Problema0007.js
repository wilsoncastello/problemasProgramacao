//Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.C

const prompt = require('prompt-sync')({sigint: true});

let salario = parseFloat(prompt("Digite o salário do funcionário: "))
let aumento = parseFloat(prompt("Digite o percentual de aumento do salário do funcionário: "))

let valorAumento = (salario * aumento / 100)
let novoSalario = (salario + valorAumento)

console.log("O valor do aumento do salário é de: " +valorAumento)
console.log("O novo salário é de: " + novoSalario)
