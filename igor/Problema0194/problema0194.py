n1 = int(input("Escreve o primeiro numero: "))
n2 = int(input("Escreve o segundo numero: "))

somatorio = 0

for i in range (n1+1,n2):
    m = i%2
    if m == 0:
        somatorio = somatorio + i
        print(i)

print("Somatorio: ", somatorio)