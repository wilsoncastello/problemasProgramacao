crit1 = 0
crit2 = 0
crit3 = 0
v1 = -1
v2 = -1
v3 = -1
alunos = []
notas = list(range(5))

for i in range(5):
    print("\nDigite o nome do",i,"º aluno: ")
    alunos.append(input())
    soma1 = 0
    soma2 = 0
    soma3 = 0
    maior1 = 0
    maior2 = 0
    k = 0
    maior3 = 0
    maior4 = 0
    for j in range(4):
        linha = list(range(4))
        if(j == 0):
            print("Digite a nota 1 do Primeiro Professor: ")
        elif(j == 1):
            print("Digite a nota 1 do Segundo Professor: ")
        elif(j == 2):
            print("Digite a nota 2 do Primeiro Professor: ")
        else:
            print("Digite a nota 2 do Segundo Professor: ")
        linha.append(int(input()))

        soma1 += linha[j]

        if(linha[j] > maior1):
            maior1 = linha[j]
            k = j

        if(linha[j] > maior3 and j < 2):
            maior3 = linha[j]
        elif(linha[j] > maior4 and j > 1):
            maior4 = linha[j]
        soma3 = maior3 + maior4
        notas.append(linha)

    if(crit1 < (soma1 / 4)):
        crit1 = soma1 / 4
        v1 = i
    

    for j in range(4):
        if(linha[j] > maior2 and j != k):
            maior2 = linha[j]
        soma2 = maior1 + maior2
    
    if(crit2 < (soma2 / 2)):
        crit2 = soma2 / 2
        v2 = i
    

    if(crit3 < (soma3 / 2)):
        crit3 = soma3 / 2
        v3 = i

print("Vencedor Critério 1:",alunos[v1])
print("Vencedor Critério 2:",alunos[v2])
print("Vencedor Critério 3:",alunos[v3])

if(v1 != v2 and v1 != v3):
    if(v1 > v2 and v1 > v3):
        print("Vencedor Geral:",alunos[v1])
    elif(v2 > v1 and v2 > v3):
        print("Vencedor Geral:",alunos[v2])
    elif(v3 > v1 and v3 > v2):
        print("Vencedor Geral:",alunos[v2])

elif(v1 == v2):
    print("Vencedor Geral:",alunos[v1])
elif(v2 == v3):
    print("Vencedor Geral:",alunos[v2])
elif(v3 == v1):
    print("Vencedor Geral:",alunos[v3])
