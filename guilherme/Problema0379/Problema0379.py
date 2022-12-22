m = []
qtdPares = 0
somaImpares = 0
soma = 0
for i in range(3):
    linha = []
    for j in range(4):
        print("Digite o elemento da linha: {}, coluna: {}".format(i,j))
        linha.append(int(input()))
        if linha[j] % 2 == 0:
            qtdPares += 1
        if linha[j] % 2 == 1:
            somaImpares += linha[j]
        soma += linha[j]

media = soma/12
print("Quantidade de elementos pares:",qtdPares)
print("Soma dos elementos impares:",somaImpares)
print("Média de todos os elementos:",media)