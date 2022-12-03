M = []
R = []
maiorN = -999999999

for l in range(2):
    linhaM = []
    for c in range(2):
        x = int(input(f"Digite o valor na posiçao [{l}][{c}]:"))
        linhaM.append(x)
        if(x > maiorN):
            maiorN = x
    M.append(linhaM)

for l in range(2):
    linhaR = []
    for c in range(2):
        x = M[l][c] * maiorN
        linhaR.append(x)
    R.append(linhaR)


for l in range(2):
    for c in range(2):
        print(R[l][c], end = " ")
    print()