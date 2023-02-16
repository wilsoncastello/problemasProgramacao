const prompt = require("prompt-sync")({ sigvar: true });

var vetorNomeLojas = []
var vetorProdutos = []
var matrizProdutosLoja = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

for(var i = 0; i < 8; i++){
    vetorNomeLojas[i] = prompt("Digite o nome da loja na posição ["+i+"]: ")
}

for(var i = 0; i < 4; i++){
    vetorProdutos[i] = prompt("Digite o nome do produto na posição ["+i+"]: ")
}

for(var i = 0; i < 8; i++){
    for(var j = 0; j < 4; j++){
        matrizProdutosLoja[i][j] = parseFloat(prompt("Loja ["+i+"] Produto ["+j+"]: R$ "))
    }
}

for(var i = 0; i < 8; i++){
    for(var j = 0; j < 4; j++){
        if(matrizProdutosLoja[i][j] <= 120){
            console.log(vetorNomeLojas[i] + " - " + vetorProdutos[j])
        }
    }
}

