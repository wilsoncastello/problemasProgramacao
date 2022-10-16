const prompt = require("prompt-sync")({ sigint: true });

var nConta = prompt("Escreve numero Conta: ")
var n1 = nConta.charAt(0)
var n2 = nConta.charAt(1)
var n3 = nConta.charAt(2)
var nInverso = n3+n2+n1

var nC = parseInt(nConta)
var nI = parseInt(nInverso)
var soma = nC+nI

var sm = soma.toString()
var s1 = sm.charAt(0)
var s2 = sm.charAt(1)
var s3 = sm.charAt(2)

var m1 = parseInt(s1)
var m2 = parseInt(s2)
var m3 = parseInt(s3)
var verificador = (m1*1)+(m2*2)+(m3*3)

console.log("Numero verificador: "+verificador)