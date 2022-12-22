m = []
cont = 0
for i in range(4):
    linha = []
    for j in range(4):
        linha.append(int(input("Digite um número inteiro: ")))
        if(linha[j] > 30):
            cont += 1
    m.append(linha)
print("Quantidade de elementos maior que 30:", cont)