
n0 = (int(input("Digite o primeiro valor de um intervalo fechado: ")))
nx = (int(input("Digite o último valor de um intervalo fechado: ")))

if(nx < n0):       
    for i in range(nx, n0+1):
        print(str(i))

else: 
    for i in range(n0, nx+1):
        print(str(i))
    
