# Entrada de valores
menor_notas = [0, 0, 0]
menor_provas = [10, 10, 10]
provas_quantidade = [0, 0, 0]
notas = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
provas = 3
alunos = 3

for num in range(alunos):
    verificacao = 10
    for nota in range(provas):
        notas[num][nota] = (
            float(input(f"Digite a {nota + 1} nota do {num + 1} aluno: ")))
        if notas[num][nota] <= verificacao:
            verificacao = notas[num][nota]
            menor_notas[num] = nota + 1
        if menor_provas[nota] >= notas[num][nota]:
            menor_provas[nota] = notas[num][nota]


# Cálculo da quantidade de menores notas
for num in range(provas):
    for aluno in range(alunos):
        if notas[aluno][num] == menor_provas[num]:
            provas_quantidade[num] += 1

# Saída
print("---Relatório---")
for num in range(alunos):
    print(f"A menor nota do {num+1} aluno foi na prova {menor_notas[num]}")
for num in range(provas):
    print(
        f"A quantdiade de alunos que tiraram a menor nota na prova {num + 1} foi {provas_quantidade[num]}")
