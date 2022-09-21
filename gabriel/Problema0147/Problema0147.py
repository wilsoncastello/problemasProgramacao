"""
Faça um programa que receba: O código de um produto comprado, supondo que a digitação do código do produto seja sempre válida, isto é, um número inteiro entre 1 e 10; O peso do produto em quilos. O código do país de origem, supondo que a digitação do código seja sempre válida, isto é, um número inteiro entre 1 e 3. Tabelas: Calcule e mostre: o peso do produto convertido em gramas; o preço total do produto comprado; o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto comprado e depende do país de origem; o valor total, preço total do produto mais imposto.
Código país de origem     imposto                              Código do produto       Preço por grama
1                             0%                                    1 a 4                     10
2                            15%                                    5 a 7                     25
3                            25%                                    8 a 10                    35
"""

codigoProduto = int(input("Digite o código do produto comprado: "))
pesoKilo = float(input("Digite o peso do produto comprado (kg): "))
codigoPais = int(input("Digite o codigo do país de origem: ")) 

if(codigoProduto == 1 or codigoProduto == 2 or codigoProduto == 3 or codigoProduto == 4):
    precoGrama = 10

elif(codigoProduto == 5 or codigoProduto == 6 or codigoProduto == 7):
    precoGrama = 25

else: 
    precoGrama = 35



if(codigoPais == 1):
    imposto = 0

elif(codigoPais == 2):
    imposto = 15

else:
    imposto = 25



pesoGrama = pesoKilo *1000
precoSemImposto = pesoGrama * precoGrama
valorImposto = precoSemImposto * imposto / 100
precoFinal = precoSemImposto + valorImposto

print("Peso em gramas: " + str(pesoGrama))
print("Preço do produto sem imposto: " + str(precoSemImposto))
print("Valor do imposto: " + str(valorImposto))
print("Preço Final: " + str(precoFinal))