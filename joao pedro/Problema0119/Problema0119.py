import math


n1=float(input("Digite um valor: "))
n2=float(input("Digite um valor: "))

if n1 > n2: 
            quadrado = n2 * n2
            raiz = math.sqrt(n1)
            print("O menor numero elevado ao quadrado: " , quadrado)
            print("A raiz quadrada do maior numero: " , raiz)

else: 
            quadrado = n1 * n1
            raiz = math.sqrt(n2)
            print("O menor numero elevado ao quadrado: " , quadrado)
            print("A raiz quadrada do maior numero: " , raiz)

        