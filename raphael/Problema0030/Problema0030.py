# -- coding: utf-8 --

#João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso, ele deverá pagar multa de 2% sobre cada conta. Faça um programa que leia o valor do salário e das duas contas, calcule e mostre quanto restará do salário de João (considere que o salário de João sempre será suficiente para pagar as contas).

salario = float(input("Digite o salário de João: "))

conta1 = float(input("Digite valor da primeira conta: "))

conta2 = float(input("Digite o valor da segunda conta: "))

multa1 = conta1 / 50;
multa2 = conta2 / 50;
restoSalario = salario - conta1 - conta2 - multa1 - multa2

print("")
print("Restará {} reais do salário de João.".format(restoSalario))