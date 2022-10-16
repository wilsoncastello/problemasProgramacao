nTurma = input("Escreve numero turma: ")

reprovado = 0
while nTurma!="*":
    nAula = int(input("Numero aula: "))
    nAluno = int(input("Numero aluno: "))

    for x in range(nAluno):
        nFaltas = int(input("Numero faltas: "))
        percentualFaltas = (nFaltas*100)/nAula

        if percentualFaltas > 25:
            reprovado = reprovado+1

    print(nTurma,": Numero reprovado: ",reprovado)

    nTurma = input("Escreve numero turma: ")