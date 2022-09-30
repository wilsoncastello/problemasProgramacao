//"Crie um algoritmo que informe a quantidade total de calorias de uma refeição a partir da escolha do usuário 'que deverá informar o prato, a sobremesa e bebida
//(veja a tabela a seguir).

//PRATO                                 SOBREMESA                                     BEBIDA
//Vegetariano 180cal               Abacaxi 75cal                                   Chá 20cal
//Peixe 230cal                     Sorvete diet 11Ocal                             Suco de laranja 70cal
//Frango 250cal                    Mousse diet 1 7Ocal                             Suco de melão 1 OOcal
//Carne 350cal                     Mousse chocolate 200cal                         Refrigerante diet 65cal"

const prompt = require('prompt-sync')({sigint: true});

let prato = prompt("Digite o prato escolhido (Vegetariano, peixe, frango ou carne): ");
let sobremesa = prompt("Digite a sobremesa escolhida (Abacaxi, sorvete diet, mousse diet ou mousse chocolate): ");
let bebida = prompt("Digite a bebida escolhida (Chá, suco de laranja, suco de melão, refrigerante diet): ");


//prato
if(prato.toLowerCase() == "vegetariano"){
        caloriaPrato = 180;

}else if(prato.toLowerCase() == "peixe"){
        caloriaPrato = 230;

}else if(prato.toLowerCase() == "frango"){
         caloriaPrato = 250; 

}else{
         caloriaPrato = 350;
}


//sobremesa
if(sobremesa.toLowerCase() == "abacaxi"){
    caloriaSobremesa = 75;

}else if(sobremesa.toLowerCase() == "sorvete diet"){
    caloriaSobremesa = 110;

}else if(sobremesa.toLowerCase() == "mousse diet"){
    caloriaSobremesa = 170;

}else{
    caloriaSobremesa = 200;
}


//bebida
if(bebida.toLowerCase() == "refrigerante diet"){
    caloriaBebida = 65;

}else if(bebida.toLowerCase() == "suco de laranja"){
    caloriaBebida = 70;

}else if(bebida.toLowerCase() == "suco de melão"){
    caloriaBebida = 100;

}else{
    caloriaBebida = 20;
}


let caloriaTotal = caloriaPrato + caloriaSobremesa + caloriaBebida;

console.log("Total de calorias consumidas na refeição escolhida: " +caloriaTotal);
