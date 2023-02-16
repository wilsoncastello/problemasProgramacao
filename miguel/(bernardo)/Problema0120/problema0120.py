# Entrada de valores
salario = float(input("Digite o valor do salário: "))


# Cálculo do desconto
if salario <= 600:
    desconto = 0
elif salario <= 1200:
    desconto = salario * 0.20
elif salario <= 2000:
    desconto = salario * 0.25
else:
    desconto = salario * 0.30

# Saída
print(f"Desconto: R${round(desconto,2)}")
