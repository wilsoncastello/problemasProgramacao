"""
Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário
"""

salario = float(input("Digite o salário do funcionário: "))
aumento = float(input("Digite a porcentagem de aumento do salário do funcionário: "))


valorAumento = salario * aumento / 100
novoSalario = valorAumento + salario


print("Valor do aumento do salário: " + str(valorAumento))
print("Valor do novo salário: " + str(novoSalario))

