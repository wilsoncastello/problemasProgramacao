n = int(input("Digite o número de Códigos: "))
for i in range(1, n+1):
    resultado = 0
    resto = 0
    div = 10000
    x = 6
    somaParcelas = 0
    codigo = int(input("Digite um Código com 5 Dígitos: "))
    for j in range(5):
        if(j == 0):
            resultado = codigo // div
            resto = codigo % div
            div /= 10
            somaParcelas += (x * resultado)
            x -= 1
        else:
            resultado = resto // div
            resto %= div
            div /= 10
            somaParcelas += (x * resultado)
            x -= 1
    print("Somatório das Parcelas:",somaParcelas)
    restoParcelas = somaParcelas % 11
    digitoVerificador = 11 - restoParcelas
    if(digitoVerificador == 10 or digitoVerificador == 11):
        digitoVerificador = 0
    print("Digito Verificador({0}): {1}\n".format(i, digitoVerificador))

