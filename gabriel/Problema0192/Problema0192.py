print("Digite o primeiro e o último valor inteiro de um intervalo")

n0 = int(input())
nx = int(input())

if(n0 < nx):
    for i in range(n0, nx + 1):
        print (i)

else:
    for i in range(nx, n0 + 1):
        print (i)
