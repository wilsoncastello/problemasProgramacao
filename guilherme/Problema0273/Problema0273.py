logica = list(range(15))
linguagemProgramacao = list(range(10))

for i in range(0, 15):
    logica[i] = int(input("Digite uma matricula da turma de Lógica: "))
for i in range(0, 10):
    linguagemProgramacao[i] = int(input("Digite uma matricula da turma de Linguagem de Programação: "))

for i in range(0, 15):
    j = 0
    while(j != 10):
        if(logica[i] == linguagemProgramacao[j]):
            print("Número de matrícula matrículado nos dois cursos: ",logica[i])
            j += 1
        else:
            j += 1
    