const prompt = require("prompt-sync")({ sigint: true })

var x = Number(prompt("Digite um número para a abscissa: "));
var y = Number(prompt("Digite um número para a coordenada: "));
var quadrante = 0;

if(x >= 0 && y >= 0){
    quadrante = 1;
}else if(x < 0 && y >= 0){
    quadrante = 2;
}else if(x < 0 && y < 0){
    quadrante = 3;
}else if(x >= 0 && y < 0){
    quadrante = 4;
}

console.log("O ponto está localizado no "+ quadrante +"º quadrante");

