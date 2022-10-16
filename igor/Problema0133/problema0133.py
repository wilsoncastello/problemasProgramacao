nome = input("Escreve o nome do produto: ")
valorCompra = float(input("Escreve o valor da compra: "))

if valorCompra <100:
    valorVenda = (valorCompra * 70)/100
elif 100<= valorCompra < 300:
    valorVenda = (valorCompra * 50)/100
elif 300<= valorCompra  <500:
    valorVenda = (valorCompra * 40)/100
else:
    valorVenda = (valorCompra * 30)/100

print("Nome do produto: ",nome)
print("Valor da venda: ",valorVenda)