x = float(input("Digite o valor de x: "))

soma = float(0)
fat = float(1)


for i in range(0, 10):
    j = i
    fat = 1
    while(j > 1):
        fat = fat * j
        j = j-1
    
    
    soma = soma + x**i / fat

print(soma)