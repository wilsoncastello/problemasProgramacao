#Faça um programa que receba a idade de uma pessoa e mostre a mensagem de maioridade (igual ou superior a 18 anos) ou não.

idade = int(input("Digite a idade de uma pessoa: "))

if idade < 18: 
    print("\n A pessoa não é maior de idade")
else :
    print("\n A pessoa é maior de idade")