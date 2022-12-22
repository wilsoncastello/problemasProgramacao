matriz = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

#Preenchendo a matriz
for i in range (0, 5):
    for j in range (0, 5):
        matriz[i][j] = int(input(f"Digite um numero na posicao [{i, j}]"))

opcao = int(input("Deseja solicitar uma linha para ser verificada? 0 (sim), -1 (não)"))

while(opcao != -1):
    linhaEscolhida = int(input("Escolha uma linha para ser verificada (de 0 e 4): "))

    for j in range (0, 5):
        print(matriz[linhaEscolhida][j])
        
    opcao = int(input("Deseja solicitar uma linha para ser verificada? 0 (sim), -1 (não)"))
