const prompt = require("prompt-sync")({ sigint: true });

console.log("Tipos de carros: A, B e C.")
var distancia = +prompt("Digite a distância de um percurso em Km: ")

var tipoCarro = prompt("Digite o tipo de carro: ")

if (tipoCarro == ("A")){
    console.log("O consumo estimado de combustível é de " + (distancia/12));
} else if (tipoCarro == ("B")){
    console.log("O consumo estimado de combustível é de " + (distancia/9));
} else if (tipoCarro == ("C")){
    console.log("O consumo estimado de combustível é de " + (distancia/8));        
}