from math import inf


x=int(input("Digite a quantidade de numeros que quer digitar: "))
maiorNumero=-inf
menorNumero=inf
for x in range(x):
    print("Digite um valor para o ",x," numero: ")
    numero=float(input())

    if numero>maiorNumero:
        maiorNumero=numero
    if numero<menorNumero:
        menorNumero=numero    

print("Maior numero:",maiorNumero)
print("Menor numero: ",menorNumero)