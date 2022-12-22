vetorSexos = []

contMasculinos = 0

for i in range(0, 10):
    sexo = input("Informe o sexo da pessoa (M/F): ")
    vetorSexos.append(sexo)
    if(vetorSexos[i] == 'm' or vetorSexos[i] == 'M'):
        contMasculinos = contMasculinos + 1

print(f"O total de pessoas do sexo masculino é -> {contMasculinos}")