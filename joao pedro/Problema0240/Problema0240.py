import math


quantidade=int(input("Digite a quantidade de numeros: "))
octal=0
decimal=0
j=0
for quantidade in range (quantidade):
    octal=int(input("Digite um valor na base 8: "))
    decimal = 0
    j = 0
    resto = octal
    while (resto > 0) :
        decimal += int(resto%10)*8**j
        resto =int(resto/10) 
        j += 1
            
        
    
    print("Numero na base 8: ",octal)
    print("Numero na base 10: ",decimal)    

