import math

# Entrada de valores

idade = int(input("Digite a idade: "))
peso = float(input("Digite o peso: "))

# Cálculo da dosagem
if idade >= 12:
    if peso >= 60:
        mg = 1000
    else:
        mg = 875
else:
    if peso <= 9:
        mg = 125
    elif peso <= 16:
        mg = 250
    elif peso <= 24:
        mg = 375
    elif peso <= 30:
        mg = 500
    else:
        mg = 750

gotas = mg / 500 * 20

# Saída
print(f"O paciente deve tomar: {gotas} gotas")
