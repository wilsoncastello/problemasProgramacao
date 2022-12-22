const prompt = require("prompt-sync")({ sigvar: true });

var vetorSexos = []

var contMasculinos = 0

for (var i = 0; i < 10; i++) {
    vetorSexos[i] = prompt("Informe o sexo da pessoa (M/F): ")

    if(vetorSexos[i] == 'm' || vetorSexos[i] == 'M'){
        contMasculinos++
    }
}

console.log("O total de pessoas do sexo masculino é -> " + contMasculinos)