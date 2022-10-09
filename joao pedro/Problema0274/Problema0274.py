from turtle import pos


print("--Digite 10 numeros--")
numero=0
positivo=0
negativo=0
for i in range (10):
    print("Digite um valor para o numero de posicao ",i,": ")
    numero=float(input(""))
    if numero>0:
        positivo=positivo+numero
    else:
        negativo+=1

print("A soma de todos os numeros positivos: ",positivo)
print("A quantidade de numeros negativos: ",negativo)