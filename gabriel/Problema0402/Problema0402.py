def somarElementos(a, b, c):
    soma = 0
    
    for i in range(b, c+1):
        if(i % a == 0):
            soma = soma + i
      
    return soma
  

a = int(input("Digite o valor de 'a', sendo um valor maior que 1: "))

while(a <= 1):
    print("Digite um valor valido")
    a = int(input("Digite o valor de 'a', sendo um valor maior que 1: "))
    

b = int(input("Digite o valor de 'b': "))

c = int(input("Digite o valor de 'c': "))

soma = somarElementos(a, b, c)

print("Soma dos valores entre b e c, que são divisíveis por a: " + str(soma))