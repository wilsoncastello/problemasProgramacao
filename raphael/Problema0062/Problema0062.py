# Uma pessoa comprou quatro artigos em uma loja. Para cada artigo, tem-se o nome, preço e percentual de desconto. Faça um algoritmo que imprima nome, preço e preço com desconto de cada artigo. Imprima também o total a pagar.

nome1 = input("Digite o nome do primeiro artigo: ")
pr1 = float(input("Digite o preço do primeiro artigo: "))
dc1 = float(input("Digite o desconto do primeiro artigo (em porcentagem): "))

nome2 = input("Digite o nome do segundo artigo: ")
pr2 = float(input("Digite o preço do segundo artigo: "))
dc2 = float(input("Digite o desconto do segundo artigo (em porcentagem): "))

nome3 = input("Digite o nome do terceiro artigo: ")
pr3 = float(input("Digite o preço do terceiro artigo: "))
dc3 = float(input("Digite o desconto do terceiro artigo (em porcentagem): "))

nome4 = input("Digite o nome do quarto artigo: ")
pr4 = float(input("Digite o preço do quarto artigo: "))
dc4 = float(input("Digite o desconto do quarto artigo (em porcentagem): "))

prdc1 = pr1 - ((dc1 / 100) * pr1)
prdc2 = pr2 - ((dc2 / 100) * pr2)
prdc3 = pr3 - ((dc3 / 100) * pr3)
prdc4 = pr4 - ((dc4 / 100) * pr4)

totalPagar = prdc1 + prdc2 + prdc3 + prdc4

print("")
print("Nome do primeiro artigo: {}".format(nome1))
print("Preço: {}".format(pr1))
print("Preço com desconto: {}".format(prdc1))
print("")
print("Nome do segundo artigo: {}".format(nome2))
print("Preço: {}".format(pr2))
print("Preço com desconto: {}".format(prdc2))
print("")
print("Nome do terceiro artigo: {}".format(nome3))
print("Preço: {}".format(pr3))
print("Preço com desconto: {}".format(prdc3))
print("")
print("Nome do quarto artigo: {}".format(nome4))
print("Preço: {}".format(pr4))
print("Preço com desconto: {}".format(prdc4))
print("")
print("Total a pagar: {}".format(totalPagar))