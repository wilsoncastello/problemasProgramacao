# Crie um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral:
#* não-eleitor (abaixo de 16 anos)
#* eleitor obrigatório (entre 18 e 65 anos)
#* eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)

idade = int(input("Digite a idade de uma pessoa: "))

if (idade < 16):
    print("classe eleitoral: não eleitor")

elif (idade > 17 and idade < 66):
    print("classe eleitoral: eleitor obrigatório")

else:
    print("classe eleitoral: eleitor facultativo")