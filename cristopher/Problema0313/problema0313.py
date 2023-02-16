vet = []
posPar = 0

for i in range(0, 10):
    numero = int(input(f"Digite o numero na posicao [{i}]: "))
    vet.append(numero)

for i in range(0, 10):
    if(vet[i] % 2 == 0):
        posPar = i

print(f"Posicao do ultimo numero par: {posPar}")
