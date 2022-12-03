vNome = []
vPreco = []
contPreco50 = 0
contPreco100 = 0
somaPreco100 = 0

for i in range(5):
    nome = input(f"Digite o nome do {i+1} ° produto: ")
    vNome.append(nome)
    preco = int(input("Digite seu preço: "))
    vPreco.append(preco)

for i in range(5):
    if(vPreco[i] < 50):
        contPreco50 = contPreco50 + 1
    if(vPreco[i]) > 100:
        contPreco100 = contPreco100 + 1
        somaPreco100 = somaPreco100 + vPreco[i]
    
media = (somaPreco100/contPreco100)

print("Nome dos produtos com preço entre 50 e 100: ")
for i in range(5):
    if(vPreco[i] >= 50 and vPreco[i] <= 100):
        print(vNome[i])
        
print("Quantidade de produtos com preço abaixo de 50: %d" %contPreco50)
print("Media dos preços dos produtos com preço superior a 100: %d" %media)