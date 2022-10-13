#Implementar um algoritmo para calcular o valor de e^X O valor de X devera ser digitado. O valor de e^X será calculado pela soma dos 10 primeiros termos da serie a seguir: e^x = 1 + x + x^2/2! + x^3/3! + ...   

x = float(input("Digite o valor de x: "))

soma = float(0)
fat = float(1)

for i in range(10):
    j = i
    
    if(i>0):
      fat = i
    
    while(i > 1):
      fat = fat * (i-1)
      i = i - 1

    i = j
    
    
    soma = soma + (x**i)/fat
    
print("e^x = " +str(soma))