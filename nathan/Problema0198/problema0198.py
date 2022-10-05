print("SEQUÊNCIA DE RICCI")
n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))

print(n1)
print(n2)

for x in range(5):
    n3 = n1 + n2
    print(n3)
    n1 = n2
    n2 = n3