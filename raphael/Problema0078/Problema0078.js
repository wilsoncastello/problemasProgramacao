const prompt = require("prompt-sync")({ sigint: true });

/* Elaborar um programa que leia uma medida em pés e apresente o seu valor convertido em metros, lembrando que um pé mede 0,3048 metro, ou seja, um pé é igual a 30,48 centímetros. */

var pes, metros;

pes = Number(prompt("Digite o valor em pés: "));

metros = pes * 0.3048;

console.log(pes+" pés equivalem a "+metros+" metros");