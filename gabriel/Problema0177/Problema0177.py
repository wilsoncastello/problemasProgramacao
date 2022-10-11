"""
Faça um programa que receba um conjunto de valores inteiros e positivos, calcule e mostre o maior e o menor valor do conjunto. Considere que: *Para encerrar a entrada de dados, deve ser digitado o valor zero; *Para valores negativos, deve ser enviada uma mensagem; *Os valores negativos ou iguais a zero não entrarão nos cálculos.
"""

print("Digite valores inteiros e positivos (quando quiser encerrar o programa digite '0')")
valor = int(input())
maior = 0
menor = 2999999999

while(valor != 0):
    

    if(valor > maior):
        maior = valor

    if(valor < menor and valor > 0):
        menor = valor

    elif(valor < 0):
        print("Os valores negativos ou iguais a zero não entrarão nos cálculos.")

    valor = int(input())

print("Maior valor digitado: " + str(maior))
print("Menor valor digitado: " + str(menor))

