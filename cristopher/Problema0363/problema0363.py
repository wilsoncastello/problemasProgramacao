vetorNomeLojas = []
vetorProdutos = []
matrizProdutosLoja = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

for i in range(0, 8):
    nome = input(f"Digite o nome da loja na posição [{i}]: ")
    vetorNomeLojas.append(nome)

for i in range(0, 4):
    produto = input(f"Digite o nome do produto na posução [{i}]: ")
    vetorProdutos.append(produto)

for i in range(0, 8):
    for j in range(0, 4):
        matrizProdutosLoja[i][j] = int(input(f"Loja [{i}] Produto [{j}]: R$ "))

for i in range(0, 8):
    for j in range(0, 4):
        if(matrizProdutosLoja[i][j] <= 120):
            print(f"{vetorNomeLojas[i]} - {vetorProdutos[j]}")

        



        