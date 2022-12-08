numero = int(input("Digite um número inteiro positivo: "))
primo = True
        
for i in range(2, numero):
    if(numero % i == 0):
        primo = False
        print("o número "+str(numero)+ " não é primo");
        break
            
        
if(primo == True):
    print("O numero "+str(numero)+ " é primo")
