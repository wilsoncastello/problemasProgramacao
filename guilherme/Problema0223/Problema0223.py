from tkinter import N


somaPositivos = 0 
qtdNegativos = 0
for i in range(1, 51):
    n = int(input("Digite o {0} número: ".format(i)))
    if(n >= 0):
        somaPositivos += n
    else:
        qtdNegativos += 1
print("Soma dos Positivos:",somaPositivos)
print("Quantidade de Negativos:",qtdNegativos)