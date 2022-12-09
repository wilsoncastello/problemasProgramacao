# Entrada de valores
lista = []
tamanho = 0
quantidade = 0

tamanho = int(input("Digite o número de funcionários da empresa: "))

for num in range(tamanho):
    funcionario = (
        str(input(f"Digite a profissão do {num + 1} funcionário: ")))
    lista.append(funcionario)

# Cálculo da quantidade de dentistas na empresa
for num in range(len(lista)):
    if lista[num].lower() == "dentista":
        quantidade += 1

# Saída
print(f"Quantidade de dentistas da empresa: {quantidade}")
