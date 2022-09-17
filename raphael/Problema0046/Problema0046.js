const prompt = require("prompt-sync")({ sigint: true });

/* Faça um programa que leia um número no formato CDU e imprima-o invertido: UDC. (Exemplo: 123, sairá 321.) O numero deverá ser armazenado em outra váriavel antes de ser impresso. */

var cdu, temp, temp2, temp3, udc;

cdu = Number(prompt("Digite o numero em CDU: "));

temp = cdu % 10;
udc = temp * 100;
temp2 = (cdu % 100) - temp;
udc = udc + temp2;
temp3 = cdu / 100;
udc = udc + temp3;

console.log(parseInt(udc));