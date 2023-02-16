def mediaSalarial(vetorSalario, habitantes):
    soma = 0
    mediaSalarial = 0
    for i in range(0, habitantes):
        soma = soma + vetorSalario[i]

    mediaSalarial = soma / habitantes

    return mediaSalarial


def retornaMaiorIdade(vetorIdade, habitantes):
    maiorIdade = 0

    for i in range(0, habitantes):
        if(vetorIdade[i] > maiorIdade):
            maiorIdade = vetorIdade[i]

    return maiorIdade

def retornaMenorIdade(vetorIdade, habitantes):
    menorIdade = 999

    for i in range(0, habitantes):
        if(vetorIdade[i] < menorIdade):
            menorIdade = vetorIdade[i]

    return menorIdade

def qtdHabitantesTresFilhos(vetorSalario, vetorFilhos, habitantes):
    total = 0
    for i in range(0, habitantes):
        if(vetorFilhos[i] == 3 and vetorSalario[i] <= 500):
            total = total + 1

    return total    

habitantes = 10
vetorIdade = []
vetorSalario = []
vetorFilhos = []

for i in range(0, habitantes):
    idade = int(input(f"Digite a idade da pessoa [{i}]: "))
    vetorIdade.append(idade)
    salario = float(input(f"Digite o salário da pessoa [{i}]: "))
    vetorSalario.append(salario)
    qtdFilhos = int(input(f"Digite a quantidade de filhos da pessoa [{i}]: "))
    vetorFilhos.append(qtdFilhos)

print(mediaSalarial(vetorSalario, habitantes))
print(retornaMaiorIdade(vetorIdade, habitantes))
print(retornaMenorIdade(vetorIdade, habitantes))
print(qtdHabitantesTresFilhos(vetorSalario, vetorFilhos, habitantes))