valor = int(input("Digite valores inteiros e positivos (quando desejar encerrar o programa digite '0')"))

maior = 0
menor = 299999999

while (valor != 0):
  
    if (valor < 0):
        print("Os valores negativos ou iguais a zero não entrarão nos cálculos")
    

    else:
  
        if (valor > maior):
            maior = valor
        

        if (valor < menor):
            menor = valor
  
    valor = int(input("Digite outro valor: "))



print("Maior valor digitado: " + str(maior))
print("Menor valor digitado: " + str(menor))