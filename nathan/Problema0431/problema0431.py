def inverterV(v):
    v = v.reverse()

n = int(input("Digite o tamanho do vetor: "))
v = []

for i in range(n):
    x = int(input(f"Digite o valor na posição {i}: "))
    v.append(x)

inverterV(v)
print(v)
    