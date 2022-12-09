A = int(input("Digite o primeiro número: "))
B = int(input("Digite o segundo número: "))

multiplo = (A % B == 0 and not B % A == 0)

print(A," e ",B," são múltiplos: ",multiplo)