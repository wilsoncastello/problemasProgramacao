# Entrada de valores
import math


altura = float(input("Digite a altura da lata (em centímetros): "))
raio= float(input("Digite o raio da lata: (em centímetros): "))

# Cálculo do volume da lata
area = math.pi * (raio ** 2)
volume = area * altura

# Saída 
print(f"O volume da lata é: {int(volume)}ml")
