M = []

for l in range(3):
    linhaM = []
    for c in range(3):
        x = int(input(f"Digite o valor na posiçao [{l}][{c}]:"))
        linhaM.append(x)
    M.append(linhaM)

M270 = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]

for l in range(3):
    for c in range(3):
        M270[l][c] = M[c][2 - l]

for l in range(3):
    for c in range(3):
        print(M270[l][c], end = ' ')
    print(" ")
    
