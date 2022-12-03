# Entrada de valores
lista = []
tamanho = 10
quantidade = 0

for num in range(tamanho):
    valor = (
        float(input(f"Digite o {num + 1} número (digite 0 para finalizar): ")))
    if valor == 0:
        break
    else:
        lista.append(valor)

# Cálculo da quantidade do último número
for num in range(len(lista)):
    if lista[num] == lista[-1]:
        quantidade += 1

# Saída
print(f"Quantidade de {lista[-1]} digitados: {quantidade}")
