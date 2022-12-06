# Entrada de valores
compra = float(input("Digite o valor da compra: "))


# Cálculo do desconto e valor final da compra
if compra >= 5000:
    desconto = compra * 0.20
    valor = compra - desconto
else:
    desconto = compra * 0.15
    valor = compra - desconto

# Saída
print(f"Desconto: R${round(desconto,2)}")
print(f"Valor final da compra: R${round(valor,2)}")
