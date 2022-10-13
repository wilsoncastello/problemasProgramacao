# -- coding: utf-8 --

# Criar um algoritmo que imprima todos os números de 1 até 100 e a soma deles.

somador = 0

for x in range(1, 101):
    print(x)
    somador = somador + x

print("\n A soma de todos os numeros é: {}".format(somador))