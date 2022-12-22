def ordemVetor(vetorX, n):
    i = 0
    valor = vetorX[i]
    verificacao = False
    
    for j in range(1, n):
        valor = valor + 1

        if(valor == vetorX[j]):
            verificacao = True
        else:
            verificacao = False
            break

    if(verificacao == True):
        msg = "1"
        return msg

    valor = vetorX[i]
    for j in range(1, n):
        valor = valor - 1
        if(valor == vetorX[j]):
            verificacao = True
        else:
            verificacao = False
            break
    if(verificacao == True):
        msg = "2"
        return msg
    else:
        msg = "0"
        return msg

n = int(input("Digite o tamanho do vetor: "))
vetor = []

for i in range(0, n):
    elemento = int(input(f"Digite o vetor na posição {i}: "))
    vetor.append(elemento)

print(ordemVetor(vetor, n))