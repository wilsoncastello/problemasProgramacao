vetor = []
contMaioresQue50 = 0

for i in range(0,10):
    elemento = int(input(f"Digite o número na posição [{i}]: "))
    vetor.append(elemento)

for i, elemento in enumerate(vetor):
    if(vetor[i] > 50):
        contMaioresQue50 += 1
        print(f"{i} - {vetor[i]} é maior que 50.")

if(contMaioresQue50 == 0):
    print("Não há nenhum número com essa condição.")