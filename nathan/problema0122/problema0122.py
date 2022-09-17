valor = float(input("Valor a ser convertido: "))
codigo = (input("Digite o código da moeda a ser convertido(L-Libra, D-Dolar, E-Euro): "))

if codigo == 'L':
    valorConvertido = valor * 0.17
    print("Valor informado: ", valor)
    print("Valor convertido em ", codigo, ": ", valorConvertido)
elif codigo == 'D': 
    valorConvertido = valor * 0.19    
    print("Valor informado: ", valor)
    print("Valor convertido em ", codigo, ": ", valorConvertido)
elif codigo == 'E':
    valorConvertido = valor * 0.19    
    print("Valor informado: ", valor)
    print("Valor convertido em ", codigo, ": ", valorConvertido)
else:
    print("Codigo invalido")
