#Faça um programa que leia os valores de quatro notas escolares 
#bimestrais de um aluno representadas pelas variáveis N1, N2, N3 e N4, 
#calcule a média aritmética (variável MD1) desse aluno e apresente a 
#mensagem "Aprovado" se a média obtida for maior ou igual a 7; 
#caso contrário, o programa deve solicitar a quinta nota (nota de exame, 
#representada pela variável NE) do aluno e calcular uma nova média aritmética 
#(variável MD2) entre a nota de exame e a primerira média aritmática. 
#Se o valor da nova média for maior ou igual a cinco, apresentar a mensagem 
#"Aprovado em exame"; caso contrário, apresentar a mensagem "Reprovado". O programa 
#deve informar também, após a apresentação das mensagens, o valor da média obtida pelo aluno.

N1 = float(input("Digite a primeira nota do aluno(a): "))
N2 = float(input("Digite a segunda nota do aluno(a): "))
N3 = float(input("Digite a terceira nota do aluno(a): "))
N4 = float(input("Digite a quarta nota do aluno(a): "))

MD1 = (N1 + N2 + N3 + N4)/4

if(MD1 >= 7):
    print("Aprovado!")
    print("Media Final:",MD1)
else:
    print("Não passou de primeira")
    NE = float(input("Digite a nota do Exame do aluno(a): "))
    MD2 = (NE + MD1)/2
    if(MD2 >= 5):
        print("Aprovado em exame!")
        print("Media Final:",MD2)
    else:
        print("Reprovado")
        print("Media Final:",MD2)