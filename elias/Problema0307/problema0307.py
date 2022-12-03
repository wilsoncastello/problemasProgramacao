A = []
B = []
for i in range (10):
    n = float(input("Digite a temperatura em Graus Celsius para a posição %d do vetor:  " %i))
    A.append(n)
for i in range (10):
    B.append(A[i] * 9 / 5 + 32)
for i in range (10):
    print("Temperatura em Graus Celsius: ",A[i],"   Temperatura em Graus Fahrenheit: ",B[i])