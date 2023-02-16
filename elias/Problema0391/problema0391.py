matriz = []
for i in range(5):
    linhaMatriz = []
    for j in range(5):
        x = int(input(f"Digite um número para a linha {i} e coluna {j} da matriz:")) 
        linhaMatriz.append(x)
    matriz.append(linhaMatriz)
coluna = int(input("Digite o número correspondente a coluna solicitada a ser mostrada da matriz: (1 ao 5):"))
while(coluna != -1):
    print(" ")
    print("Coluna selecionada: ")
    if(coluna == 1):
        for i in range(5):
            print(matriz[i][0])
    elif(coluna == 2):
        for i in range(5):
            print(matriz[i][1])
    elif(coluna == 3):
        for i in range(5):
            print(matriz[i][2])
    elif(coluna == 4):
        for i in range(5):
            print(matriz[i][3])
    elif(coluna == 5):
        for i in range(5):
            print(matriz[i][4])
    else:
        print("Número inválido, tente novamente !")
    print("Digite o número printcorrespondente a coluna solicitada a ser mostrada da matriz: (1 ao 5):")
    coluna = int(input("Digite -1 caso queira sair. "))