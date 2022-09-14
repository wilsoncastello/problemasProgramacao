import math

#Faça um programa que leia os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa

#Entrada de dados
catAd = float(input("Digite o valor do cateto adjacente: "))
catOp = float(input("Digite o valor do cateto oposto: "))

hip = math.sqrt(math.pow(catAd, 2) + math.pow(catOp, 2))

print("O valor da hipotenusa do triangulo: {}".format(hip))