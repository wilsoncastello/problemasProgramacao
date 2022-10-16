precoProduto = float(input("Digite o preço do produto:"))
categoriaProduto = int(input("Digite a categoria do produto (1 — limpeza; 2 — alimentação; ou 3 — vestuário):"))
refrigeracao = input("Digite 'R' se o produto necessita de refrigeração, ou 'N' se não necessita:")
if precoProduto <= 25 and categoriaProduto == 1:
    valorAumento = precoProduto * 0.05
    valorTotal = precoProduto + valorAumento
    if refrigeracao == 'R' or refrigeracao == 'r':
        valorImposto = valorTotal * 0.05
    else :
        valorImposto = valorTotal * 0.08
elif precoProduto <= 25 and categoriaProduto == 2:
    valorAumento = precoProduto * 0.08
    valorTotal = precoProduto + valorAumento
    valorImposto = valorTotal * 0.05
elif precoProduto <= 25 and categoriaProduto == 3:
    valorAumento = precoProduto * 0.1
    valorTotal = precoProduto + valorAumento
    if refrigeracao == 'R' or refrigeracao == 'r':
        valorImposto = valorTotal * 0.05
    else :
        valorImposto = valorTotal * 0.08 
elif precoProduto > 25 and categoriaProduto == 1:
    valorAumento = precoProduto * 0.12
    valorTotal = precoProduto + valorAumento
    if refrigeracao == 'R' or refrigeracao == 'r':
        valorImposto = valorTotal * 0.05
    else :
        valorImposto = valorTotal * 0.08  
elif precoProduto > 25 and categoriaProduto == 2:
    valorAumento = precoProduto * 0.15
    valorTotal = precoProduto + valorAumento
    valorImposto = valorTotal * 0.05
elif precoProduto > 25 and categoriaProduto == 3:
    valorAumento = precoProduto * 0.18
    valorTotal = precoProduto + valorAumento
    if refrigeracao == 'R' or refrigeracao == 'r':
        valorImposto = valorTotal * 0.05
    else :
        valorImposto = valorTotal * 0.08
novoPreco = valorTotal - valorImposto
if novoPreco <= 50:
    print("O novo preço do produto é ",novoPreco," e o produto està classificado como barato")
elif novoPreco > 50 and novoPreco < 120:
    print("O novo preço do produto é ",novoPreco," e o produto està classificado como normal")
elif novoPreco >= 120:
    print("O novo preço do produto é ",novoPreco," e o produto està classificado como caro")