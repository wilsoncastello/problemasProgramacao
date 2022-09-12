#Faça um algoritmo que leia os preços de três mercadorias em 01/04 e 01/05 e 
#tendo como base a variação dos preços dessas mercadorias,
#calcule a taxa de inflação ocorrida neste período.

print("Digite o Preço dos dias 01/04")
prod1_0104 = float(input("Preço do primeiro produto: "))
prod2_0104 = float(input("Preço do segundo produto: "))
prod3_0104 = float(input("Preço do terceiro produto: "))
print("Digite o Preço dos dias 01/05")
prod1_0105 = float(input("Preço do primeiro produto: "))
prod2_0105 = float(input("Preço do segundo produto: "))
prod3_0105 = float(input("Preço do terceiro produto: "))

taxa1 = ((prod1_0105 - prod1_0104)/prod1_0104)*100
taxa2 = ((prod2_0105 - prod2_0104)/prod2_0104)*100
taxa3 = ((prod3_0105 - prod3_0104)/prod3_0104)*100

print("Taxa de inflação (em porcentagem) do primeiro produto:",taxa1)
print("Taxa de inflação (em porcentagem) do segundo produto:",taxa2)
print("Taxa de inflação (em porcentagem) do terceiro produto:",taxa3)