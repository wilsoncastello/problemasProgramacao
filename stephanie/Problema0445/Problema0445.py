def pesoHomem(alt)
    return 72.7 * alt - 58
def pesoMulher(alt)
    return 62.1 * alt -44.7

alt=input("Digite a altura: ")
sexo=input("Digite o sexo: ")
if(sexo == "masculino"):
    peso = pesoHomem(alt)
elif(sexo == "feminino"):
    peso = pesoMulher(alt)
print("O peso ideal é "+peso)