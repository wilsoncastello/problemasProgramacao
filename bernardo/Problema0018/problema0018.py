# Entrada de valores
altura = float(input("Digite a altura a ser alcançada(em metros): "))

# Cálco do número de degraus
altura = altura * 100
degraus = (altura // 17) 
resto = altura % 17
exatidao = (resto + 2) // (resto + 1)
degraus += 2 - exatidao
ultimo_degrau =  (exatidao -1) * 17 + resto

# Saída
print(f"Número de degraus: {degraus}")
print(f"Altura pertencente ao último degrau: {ultimo_degrau}cm")
