const prompt = require("prompt-sync")({ sigint: true });

var sMinimo = prompt("Valor salario minimo: ")
var tt = prompt("Turno Trabalho: ")
var categoria = prompt("Categoria: ")
var nHoras = prompt("Numeros horas: ")

var coeficiente = 0;
var sBruto;
var imposto = 0;
var grat;
var auxilio;
var sLiquido;

if(tt == "M"){
    coeficiente = (sMinimo*10)/100;
}else if(tt == "V"){
    coeficiente = (sMinimo*15)/100;
}else if (tt == "N"){
    coeficiente = (sMinimo*12)/100;
}
console.log("Coeficiente: "+coeficiente);

sBruto = nHoras * coeficiente;
console.log("Salario Bruto: "+sBruto);

if(categoria == "O"){
    if(sBruto >= 300){
        imposto = (sBruto*5)/100;
    }else{
        imposto = (sBruto*3)/100;
    }
}else if(categoria == "G"){
    if(sBruto >= 400){
        imposto = (sBruto*6)/100;
    }else{
        imposto = (sBruto*4)/100;
    }
}
console.log("Imposto: "+imposto);

if(tt == "N" && nHoras>80){
    grat = 50;
}else{
    grat = 30;
}
console.log("Gratificacao: "+grat);

if(categoria =="O" || coeficiente<=25){
    auxilio = sBruto/3;
}else{
    auxilio = sBruto/2;
}
console.log("Auxilio: "+auxilio);

sLiquido = sBruto - imposto + grat + auxilio;
console.log("Salario Liquido: "+sLiquido);

if(sLiquido<350){
    console.log("Mal remunerado");
}else if(sLiquido>= 250 && sLiquido<=600){
    console.log("Normal");
}else{
    console.log("Bem remunerado");
}