somaDosPositivos = 0
contNegativos = 0

print("ENTRE COM 20 NÚMEROS: ")

i = 0
while(i < 20):
    i = i + 1
    print(f"[{i}] Digite um número: ")
    numeroInformado = float(input())
    if(numeroInformado >= 0):
        somaDosPositivos = somaDosPositivos + numeroInformado
    else:
        contNegativos = contNegativos + 1

print(f"Soma dos positivos: {somaDosPositivos}")
print(f"Total de negativos: {contNegativos}")

