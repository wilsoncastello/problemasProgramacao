matrizA = [[0, 0, 0], [0, 0, 0]]
total = 0

for l in range (0, 2):
    for c in range (0, 3):
        matrizA[l][c] = int(input(f"Digite um valor na posição [{l, c}]: "))
        if(not(matrizA[l][c] >= 5 and matrizA[l][c] <= 15)):
            total = total + 1

print(matrizA)
print(total)
