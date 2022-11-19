nomecidade = []
distcidades = [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
consumoC = []
x = False

kmLitro = float(input("Digite quantos km o veículo faz por litro: "))

print("")
for i in range(0, 5):
    nomeC = input(f"Digite o nome da cidade ({i}): ")
    nomecidade.append(nomeC)

print("")
for i in range(0,5):
    for j in range(i + 1,5):
        distcidades[i][j] = float(input(f"Digite a distância entre as cidades em quilômetro ({nomecidade[i]} até {nomecidade[j]}): "))

print("")
for i in range(0, 5):
    for j in range(i + 1, 5):   
        if(distcidades[i][j] <= 250):
            print(f"{nomecidade[i]} até {nomecidade[j]}, não ultrapassou 250 Km")
            x = True

if(x == False):
    print("Todos os percursos passaram dos 250 km")

print("")
for i in range(0,5):
    for j in range(i + 1, 5):
        if(i != j):
            quantCombustivel = distcidades[i][j] * kmLitro
            print("{} até {}, gasta {} litros de combutível".format(nomecidade[i], nomecidade[j], quantCombustivel))

