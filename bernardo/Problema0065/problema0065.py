# Entrada de valores
picole_1 = float(input("Digite o número de picolés do tipo 1 vendidos: "))
picole_2 = float(input("Digite o número de picolés do tipo 2 vendidos: "))
picole_3 = float(input("Digite o número de picolés do tipo 3 vendidos: "))

# Cálculo da quantidade e valor total dos picolés
quantidade = picole_1 + picole_2 + picole_3
total = picole_1 * 1.5 + picole_2 * 2 + picole_3 * 0.75

# Saída
print(f"Quantidade vendida: {quantidade}")
print(f"Valor arrecadado: R${round(total,2)}")
