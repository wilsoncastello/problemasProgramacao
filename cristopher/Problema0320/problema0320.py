vetorA = []
vetorB = []
vetorC = []

print("VETOR A")
for i in range(0, 5):
    numero = int(input(f"Informe o numero na posicao [{i}]: "))
    if(numero % 2 == 0 or numero % 3 == 0):
        vetorA.append(numero)
    
    while(not(numero % 2 == 0 or numero % 3 == 0)):
        print("Por favor, respeite as condições...")
        numero = int(input(f"Informe o numero na posição [{i}]: "))
        vetorA.append(numero)

print("VETOR B")
for i in range(0, 5):
    numero = int(input(f"Informe no numero na posicao [{i}]: "))
    if(not(numero % 5 == 0)):
        vetorB.append(numero)

    while(numero % 5 == 0):
        print("Por favor, respeite as condições...")
        numero = int(input(f"Informe no numero na posicao [{i}]: "))
        vetorB.append(numero)

vetorC = vetorA + vetorB

print(vetorC)