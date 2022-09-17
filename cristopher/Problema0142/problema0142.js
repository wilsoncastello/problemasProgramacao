const prompt = require("prompt-sync")({ sigint: true });


var tamanhoEscada = parseFloat(prompt("Digite o tamanho da escada (em metros): "))

var alturaQuadro = parseFloat(prompt("Informe a altura em que se deseja pregar o quadro: "))

if(tamanhoEscada < alturaQuadro){
     console.log("A escada é muito pequena.")

}

var distanciaBase = (Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2))
distanciaBase = Math.sqrt(distanciaBase)

console.log("A distância em que a escada deverá ficar: " + distanciaBase)