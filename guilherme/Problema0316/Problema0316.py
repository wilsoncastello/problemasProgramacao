a = list(range(5))
b = list(range(5))
print("Digite 5 valores: ")
for i in range(5):
    a[i] = float(input())
    b[i] = a[i]**3
print("Digite um número para buscar no vetor B: ") 
x = float(input()) 
while(x != 0):
    cont = 0 
    for i in range(5):
        if(x == b[i]):
            print(x,"existe em B.") 
        else:
            cont += 1
    if(cont == 5):
        print(x,"não existe em B.") 
    print("\nDigite outro número ou 0 para encerrar: ") 
    x = float(input())
print("Até mais!") 