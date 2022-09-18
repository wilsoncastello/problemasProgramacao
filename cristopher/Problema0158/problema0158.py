codigo = int(input("Digite o código do produto (1 a 40): "))

qtdProduto = int(input("Digite a quantidade comprada deste produto: "))

if(codigo >= 1 and codigo <= 10):
    preco = 10
    print(f"Preço unitário do produto: {preco}")
elif(codigo > 10 and codigo <= 20):
    preco = 15
    print(f"Preço unitário do produto: {preco}")
elif(codigo > 20 and codigo <= 30):
    preco = 20
    print(f"Preço unitário do produto: {preco}")
else:
    preco = 30
    print(f"Preço unitário do produto: {preco}")

precoTotal = preco * qtdProduto
print(f"Preço total da nota: {precoTotal}")

if(precoTotal <= 250):
    precoDesconto = precoTotal * 5/100
elif(precoTotal > 250 and precoTotal <= 500):
    precoDesconto = precoTotal * 10/100
else:
    precoDesconto = precoTotal * 15/100

totalFinal = precoTotal - precoDesconto

print(f"Valor do desconto em si: {precoDesconto}")
print(f"Valor total da nota com desconto: {totalFinal}")
