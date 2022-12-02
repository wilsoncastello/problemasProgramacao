vCodigo = []
vNome = []
vQuant = []
vPreco = []
nProdutos = 0
somaVendas = 0
produtoVendido = False

n = int(input("Digite o código do produto(-1 Para cancelar):"))
vCodigo.append(n)

while n != -1:
    nProdutos = nProdutos + 1
    x = input("Digite o nome do produto: ")
    vNome.append(x)
    n = int(input("Digite a quantidade em estoque: "))
    vQuant.append(n)
    n = int(input("Digite o preço de venda: "))
    vPreco.append(n)
    if(nProdutos == 50):
        break
    n = int(input("Digite o código do produto(-1 Para cancelar):"))
    vCodigo.append(n)

codigo = int(input("Digite o código do produto para realizar a venda(0 para cancelar):"))

while codigo != 0:
    quant = int(input("Digite a quantidade requerida: "))
    for j in range(50):
        if(vCodigo[j] == codigo):
            produtoVendido = True
            if(quant <= vQuant[j]):
                vQuant[j] = vQuant[j] - quant
                somaVendas = somaVendas + (vPreco[j] * quant)
                print("Venda do %s com sucesso" %vNome[j])
            else:
                print("Estoque insuficiente")
            break
    if(produtoVendido == False):
        print("Produto nao cadastrado")
    codigo = int(input("Digite o código do produto para realizar a venda(0 para cancelar):"))

print("Total vendido: %d " %somaVendas)

for j in range(nProdutos):
    for k in range(nProdutos):
        if (vQuant[j] > vQuant[k]):
            auxCodigo = vCodigo[j]
            vCodigo[j] = vCodigo[k]
            vCodigo[k] = auxCodigo

            auxNome = vNome[j]
            vNome[j] = vNome[k]
            vNome[k] = auxNome

            auxQuant = vQuant[j]
            vQuant[j] = vQuant[k]
            vQuant[k] = auxQuant

            auxPreco = vPreco[j]
            vPreco[j] = vPreco[k]
            vPreco[k] = auxPreco

for i in range(nProdutos):
    print("%d %s %d %d" % (vCodigo[i], vNome[i], vQuant[i], vPreco[i]))
    


