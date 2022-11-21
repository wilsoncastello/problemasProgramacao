m = []
for i in range(3):
    maiorAltura = 0
    linha = []
    for j in range(4):
        print("Digite a altura do {}º atleta da {}ª delegação".format(j, i))
        linha.append(float(input()))
        if(linha[j] > maiorAltura):
            maiorAltura = linha[j]
    print("Maior altura da {}ª delegação: ".format(i),maiorAltura)

