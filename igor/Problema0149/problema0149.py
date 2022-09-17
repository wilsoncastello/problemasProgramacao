sMinimo = float(input("Valor salario minimo: "))
tt = input("Turno trabalho: ")
categoria = input("Categoria: ")
nHoras = int(input("Numeros Horas: "))

if tt == "M":
    coeficiente = (sMinimo * 10)/100
elif tt == "V":
    coeficiente = (sMinimo * 15)/100
elif tt == "N":
    coeficiente = (sMinimo * 12)/100
print("Coeficiente: ", coeficiente)

sBruto = nHoras * coeficiente
print("Salario Bruto: ", sBruto)

if categoria == "O":
    if sBruto >= 300:
        imposto = (sBruto*5)/100
    else:
        imposto = (sBruto*3)/100
elif categoria == "G":
    if sBruto >= 300:
        imposto = (sBruto*6)/100
    else:
        imposto = (sBruto*4)/100
print("Imposto: ",imposto)

if tt == "N" and nHoras>80:
    grat = 50
else:
    grat = 30
print("Gratificacao: ", grat)

if categoria == "O" or coeficiente <= 25:
    auxilio = sBruto/3
else:
    auxilio = sBruto/2
print("Auxilio: ",auxilio)

sLiquido = sBruto - imposto + grat + auxilio
print("Salario Liquido: ",sLiquido)

if sLiquido<350:
    print("Mal remunerado")
elif 250 <= sLiquido <= 600:
    print("Normal")
else:
    print("Bem remunerado")

