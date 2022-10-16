"""
Faça um programa que leia um número inteiro de 4 casas e imprima se o algarismo que está nas casas das unidades de milhar é ou não múltiplo de quatro.
"""
n = float(input("Digite um número inteiro de 4 digitos: "))

x = n / 1000

if(int(x) % 4 == 0):
    print("O número da unidade de milhar é multiplo de quatro")

else: 
    print("O número da unidade de milhar não é multiplo de quatro")   
