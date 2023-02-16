s1 = set()
s2 = set()

print("Preenchendo o conjunto A: ")
for i in range(0 ,5):
    numero = int(input(f"Digite o numero na posição [{i}]: "))
    s1.add(numero)

print("Preenchendo o conjunto B: ")
for i in range(0, 5):
    numero = int(input(f"Digite o numero na posição [{i}]: "))
    s2.add(numero)

s3 = s1.union(s2)

print(s3)