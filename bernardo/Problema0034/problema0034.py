# Entrada de valores
hora_t = float(input("Digite o número de horas trabalhadas: "))
salario_minimo = float(input("Digite o salário mínimo: "))
hora_e = float(input("Digite o número de horas extras: "))

# Cálculo do salário a receber
salario_bruto = hora_t * (salario_minimo / 8)
quantia_extra = hora_e * (salario_minimo / 4)
salario = salario_bruto + quantia_extra

# Saída
print(f"Salário a receber: R${round(salario,2)}")
