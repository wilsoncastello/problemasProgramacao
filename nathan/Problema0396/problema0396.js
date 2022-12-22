const prompt = require("prompt-sync")({ sigint: true });
ingTortas = [
    [],[],[],[],[],[]
]

for (var i = 0; i < 6; i++) {
    console.log("\nTorta " + (i+1) + ": ");
    for (var j = 0; j < 3; j++) {
        if(j == 0){
            ingTortas[i][j] = Number(prompt("Quantidade de xícaras de farinha de trigo: "));
        }else if(j == 1){
            ingTortas[i][j] = Number(prompt("Quantidade de xícaras de açucar: "));
        }else{
            ingTortas[i][j] = Number(prompt("Quantidade de xícaras de leite: "));
        }
    }
}
for (var i = 0; i < 6; i++) {
    var quantTortas = Number(prompt("\n Quantidade feitas da tortas " + (i+1) + ": "));
    for (var j = 0; j < 3; j++){
        ingTortas[i][j] = ingTortas[i][j] * quantTortas;
    }
}
for (var i = 0; i < 6; i++) {
    for (var j = 0; j < 3; j++){
        process.stdout.write(ingTortas[i][j] + " ");
    }
    console.log(" ");
}