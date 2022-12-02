vetor1 = []
vetor2 = []
quantidadeElementosComuns = 0
for i in range (10):
    n = int(input("Digite um número para a posição %d do primeiro vetor:  " %i))
    vetor1.append(n)
for i in range (10):
    n = int(input("Digite um número para a posição %d do segundo vetor:  " %i))
    vetor2.append(n)
print("Elementos comuns aos conjuntos:")
for i in range (10):
    for j in range (10):
        if vetor1[i] == vetor2[j] :
            print(vetor1[i])
            quantidadeElementosComuns+1
if quantidadeElementosComuns == 0 :
    print("Não há nenhum elemento comum aos conjuntos!")