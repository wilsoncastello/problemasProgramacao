numerador1 = int(input("Digite o numerador da primeira fração:"))
denominador1 = int(input("Digite o denominador da primeira fração:"))
numerador2 = int (input("Digite o numerador da segunda fração:"))
denominador2 = int(input("Digite o denominador da segunda fração:"))
for i in range (1, 0, 1):
    resto = (denominador1 * i) % denominador2
    if resto==0 :
        break
mmc = denominador1 * i
resultado = (mmc/denominador1*numerador1) + (mmc/denominador2*numerador2)
if resultado != mmc :
    print("A soma das frações é: "+resultado+"/"+mmc)
    if resultado % mmc == 0 :
        resultadoFinal = resultado / mmc
        print("O resultado final é: "+resultadoFinal)
else :
    print("A soma das frações é: "+1)