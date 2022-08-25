#Um trabalhador recebeu seu salário e o depositou em sua conta 
#bancária. Esse trabalhador emitiu dois cheques e agora deseja 
#saber seu saldo atual. Sabe-se que cada operação bancária de 
#retirada paga CPMF de 0,38% e o saldo inicial da conta está 
#zerado. Faça um programa que leia o valor do salário e dos 
#dois cheques emitidos, calcule e aprensente o saldo atual da conta.

#Entrada de dados
sal = float(input("Digite o valor do seu salario: "))
valCheq1 = float(input("Digite o valor do primeiro cheque: "))
valCheq2 = float(input("Digite o valor do segundo cheque: "))

#Processamento
valTotalcheque1 = ((38*valCheq1)/100) + valCheq1
valTotalcheque2 = ((38*valCheq2)/100) + valCheq2
saldo = sal - valTotalcheque1 - valTotalcheque2

#Saida de dados
print("")
print("Saldo atual: {}".format(saldo))