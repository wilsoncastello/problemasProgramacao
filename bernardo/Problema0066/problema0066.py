# Entrada de valores
salario_minimo = float(input("Digite o valor do salário mínimo: "))
vendas = float(input("Digite o número de vendas: "))
vendas_valor = float(input("Digite o valor arrecadado das vendas: "))

# Cálculo do salário total
salario = salario_minimo * 2 + vendas * 150 + vendas_valor * 0.05

# Saída
print(f"Valor arrecadado: R${round(salario,2)}")
