//Faça um programa que leia e imprima o nome, endereço e telefone de uma pessoa.

const prompt = require('prompt-sync')({sigint: true});

let nome = prompt("Digite seu nome: ");
let endereco = prompt("Digite seu endereco: ");
let telefone = prompt("Digite seu telefone: ");

console.log("Nome: " + nome);
console.log("Endereço: " + endereco);
console.log("Telefone: " + telefone);