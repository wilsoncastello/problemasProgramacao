# Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e de 31 anos para cima.

mediaA = 0
mediaB = 0
mediaC = 0
mediaD = 0

contA = 0
contB = 0
contC = 0
contD = 0

for x in range(15):
    idade = int(input("Digite a idade da {} ª pessoa: ".format(x+1)))
    peso = int(input("Digite o peso da {} ª pessoa: ".format(x+1)))

    if idade > 0 and idade < 11:
        mediaA = mediaA + peso
        contA = contA + 1
    elif idade > 10 and idade < 21:
        mediaB = mediaB + peso
        contB = contB + 1
    elif idade > 20 and idade < 31:
        mediaC = mediaC + peso
        contC = contC + 1
    else:
        mediaD = mediaD + peso
        contD = contD + 1

Ra = mediaA / contA
Rb = mediaB / contB
Rc = mediaC / contC
Rd = mediaD / contD

print("Peso médio das pessoas de 1 a 10 anos: {} \n \n Peso médio das pessoas de 11 a 20 anos: {} \n \n Peso médio das pessoas de 21 a 30 anos: {} \n \n Peso médio das pessoas com mais de 30 anos: {}".format(Ra, Rb, Rc, Rd))