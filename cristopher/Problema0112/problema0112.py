import math


numero = float(input("Informe um número qualquer: "))

if numero > 0:
    print(f"Imprimindo a raiz do número: {math.sqrt(numero)}")
else:
    print(f"Imprimindo o quadrado do número: {math.pow(numero, 2)}")