vetorLucros = []
contLucroMenor10 = 0 
contLucroEntre10e20 = 0
contLucroMaior20 = 0

for i in range(0,10):
    precoCompra = float(input(f"Digite o preço de compra do produto [{i}]: "))
    precoVenda = float(input(f"Digite o preço de venda do produto [{i}]: "))
    vetorLucros.append(precoVenda - precoCompra)

    if(vetorLucros[i] < (precoCompra * 10/100)):
        contLucroMenor10 = contLucroMenor10 + 1
    elif(vetorLucros[i] >= (precoCompra * 10/100) and vetorLucros[i] <= (precoCompra * 20/100)):
        contLucroEntre10e20 = contLucroEntre10e20 + 1
    else:
        contLucroMaior20 = contLucroMaior20 + 1

print(contLucroMenor10)
print(contLucroEntre10e20)
print(contLucroMaior20)