matriz = [[0] * (5) for _ in range(4)]
matrizx=0
vetor = [0.0] * (4)
vetorx=0
quantidadeArmazem = [0] * (5)
quantidadeProd = [0] * (5)
maiorEstoque = 0
posicaoPreco = 0
valorCada = [0] * (5)
menorEstoque = 9999999
j = 0
while (j < 4) :
    print("Digite o preco do produto do produto" ,j, ": ")
    vetorx=float(input(""))
    vetor.insert(j,vetorx)
    j += 1
i = 0
while (i < 5) :
    
    while (j < 4) :
        print("Digite a quantidade do produto " + str(i) + " no armazem " + str(j) + ": ")
        matrizx=int(input(""))
        matriz[i].insert(j,matrizx)
        quantidadeArmazem[i] = matriz[j][i] + quantidadeArmazem[i]
        quantidadeProd[j] = matriz[j][i] + quantidadeProd[j]
        if matrizx > maiorEstoque :
            maiorEstoque = matriz[j][i]
            posicaoPreco = j
        if matrizx < menorEstoque :
                menorEstoque = matriz[j][i]
        j += 1
    i += 1
    j=0
i = 0
while (i < 5) :
    print("Quantidade no armazem " + str(i) + ": " + str(quantidadeArmazem[i]))
    i += 1
i = 0
while (i < 4) :
    print("Quantidade do produto " + str(i) + ": " + str(quantidadeProd[i]))
    i += 1
print("Preco do produto de maior estoque: " + str(vetor[posicaoPreco]))
print("Menor estoque armazenado: " + str(menorEstoque))