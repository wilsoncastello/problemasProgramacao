def converte(numDecimal):
    if numDecimal != 0:
        numConvertido = ""
        while numDecimal > 0:
            resto = numDecimal % 2
            numConvertido = str(resto) + numConvertido
            numDecimal = numDecimal // 2
    else:
        numConvertido = "0"
    return numConvertido


numDecimal = int(input("Digite um numero na base decimal: "))
print("Número "+str(numDecimal)+ " em binário: "+converte(numDecimal))