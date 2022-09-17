produto1 = input("Digite o nome do produto 1:")
estoque1 = int(input("Digite a quantidade em estoque: "))
produto2 = input("Digite o nome do produto 2:")
estoque2 = int(input("Digite a quantidade em estoque: "))
produto3 = input("Digite o nome do produto 3:")
estoque3 = int(input("Digite a quantidade em estoque: "))
produto4 = input("Digite o nome do produto 4:")
estoque4 = int(input("Digite a quantidade em estoque: "))

print("Produtos que estão abaixo do estoque: ")
if estoque1 < 30:
    print(produto1)
if estoque2 < 30:
    print(produto2)
if estoque3 < 30:
    print(produto3)
if estoque4 < 30:
    print(produto4)            