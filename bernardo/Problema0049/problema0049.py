# Entrada de valores
razao = float(input("Digite a razão da PG: "))
termo_1 = float(input("Digite o primeiro termo: "))
posicao_n = float(input("Digite a posição desejada: "))

# Cálculo do termo da PG
termo_n = termo_1 * (razao ** (posicao_n-1))

# Saída 
print(f"O termo{int(posicao_n)} é: {termo_n}")
