soma = 0
        

numero = int(input("Digite um numero inteiro positivo: "));
        
while(numero > 0):
    resto = 0
    resto = numero % 10
    soma = soma + resto
    numero = numero // 10
            
    
        
print("Soma dos algarismos: "+str(soma))