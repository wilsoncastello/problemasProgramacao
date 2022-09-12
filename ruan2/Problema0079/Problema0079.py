#Elaborar um programa que calcule uma raiz de base qualquer com índice qualquer

import math

#Entrada de dados
base = float(input("Digite o valor da base: "))
indice = float(input("Digite o valor do índice: "))

#Processamento
num = math.pow(base, indice)

#Saída de dados
print("Valor da operação é:",num)
