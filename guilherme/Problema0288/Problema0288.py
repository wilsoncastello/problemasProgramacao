mesa = list(range(10))
n = -1
lugar = 5

for i in range(10):
    mesa[i] = 0

while(n != 0):
    n = int(input("\nDigite qual mesa você quer reservar: "))
    m = 0
    if(n > 10 or n < 0):
        print("Não existe uma mesa com esse número!")
    elif(n != 0):
        lugar = 5 - mesa[n-1]
        if(lugar > 0):
            print("Mesa",n)
            m = int(input("Digite o número de lugares até {}: ".format(lugar)))
            while(m > lugar or m < 1):
                m = int(input("Digite um valor até {}: ".format(lugar)))
            mesa[n-1] = mesa[n-1] + m
        else:
            print("Essa mesa não tem lugares disponíveis!")
    else:
        print("Até mais!")
    
    encerrar = 0
    for i in range(10):
        if(mesa[i] == 5):
            encerrar += 1
    if(encerrar == 10):
        print("Até mais!")
        break
