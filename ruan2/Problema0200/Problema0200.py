
#Entrar com nome, nota da PR1 e nota da PR2 de 15 alunos. 
#Imprimir uma listagem, contendo: nome, nota da PR1, nota da PR2 e 
#média arredondada de cada aluno. Ao final calcule a media geral da turma 

somaTurma = 0

for i in range(0,15):
    nome = input("Digite seu nome: ")
    pR1 = float(input("Digite a nota da prova 1: "))
    pR2 = float(input("Digite a nota da prova 2: "))
    print()

    media = (pR1 + pR2) / 2

    print("Informações do aluno")
    print("Nome:"+nome)
    print("Nota da Prova 1:",pR1)
    print("Nota da Prova 2:",pR2)
    print("Média Final:",round(media))
    print()

    somaTurma = somaTurma + pR1 + pR2

mediaTurma = somaTurma/15

print("Média da turma: ",round(mediaTurma))