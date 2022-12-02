m = []

for l in range(5):
    linhaM = []
    for c in range(5):
        x = int(input(f"Digite o vetor na posição [{l}][{c}] :"))
        linhaM.append(x)
    m.append(linhaM)

for l in range(5):
    for c in range(5):
        if(l > c):
            print(m[l][c], end=' ')

