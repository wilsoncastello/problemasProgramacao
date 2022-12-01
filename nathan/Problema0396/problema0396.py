ingTortas = []

for i in range(6):
    linhaIngTortas = []
    print(f"Torta {i+1}: ")
    for j in range(3):
        if i == 0:
            x = int(input("Quantidade de xícaras de farinha de trigo: "))
            linhaIngTortas.append(x)
        elif i == 1:
            x = int(input("Quantidade de xícaras de açucar: "))
            linhaIngTortas.append(x)
        else:
            x = int(input("Quantidade de xícaras de leite: "))
            linhaIngTortas.append(x)
    ingTortas.append(linhaIngTortas)

for i in range(6):
    quantTortas = int(input(f"Quantidade feitas da tortas {i+1}: "))
    for j in range(3):
        ingTortas[i][j] = ingTortas[i][j] * quantTortas

print(ingTortas)
