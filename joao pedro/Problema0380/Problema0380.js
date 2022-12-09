const prompt = require("prompt-sync")({ sigint: true });
        var matriz = [[],[],[],[],[]]
        var vetor = [[],[],[],[]]
        var quantidadeArmazem = Array(5).fill(0);
        var quantidadeProd = Array(5).fill(0);
        var maiorEstoque = 0;
        var posicaoPreco = 0;
        var valorCada = Array(5).fill(0);
        var menorEstoque = Number.MAX_VALUE;
        for (j=0; j < 4; j++)
        {
            console.log("Digite o preco do produto do produto" + j + ": ");
            vetor[j] = Number(prompt(""))
        }
        for (i=0; i < 5; i++)
        {
            for (j=0; j < 4; j++)
            {
                console.log("Digite a quantidade do produto " + i + " no armazem " + j + ": ");
                matriz[j][i] = Number(prompt(""))
                quantidadeArmazem[i] = matriz[j][i] + quantidadeArmazem[i];
                quantidadeProd[j] = matriz[j][i] + quantidadeProd[j];
                if (matriz[j][i] > maiorEstoque)
                {
                    maiorEstoque = matriz[j][i];
                    posicaoPreco = j;
                }
                if (matriz[j][i] < menorEstoque)
                {
                    menorEstoque = matriz[j][i];
                }
            }
        }
        for (i=0; i < 5; i++)
        {
            console.log("Quantidade no armazem " + i + ": " + quantidadeArmazem[i]);
        }
        for (i=0; i < 4; i++)
        {
            console.log("Quantidade do produto " + i + ": " + quantidadeProd[i]);
        }
        console.log("Preco do produto de maior estoque: " + vetor[posicaoPreco]);
        console.log("Menor estoque armazenado: " + menorEstoque);
    
