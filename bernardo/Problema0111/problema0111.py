# Entrada de valores
numero1 = float(input("Digite o primeiro número: "))
numero2 = float(input("Digite o segundo número: "))


# Cálculo da soma e verificação
soma = numero1 + numero2
if soma > 20:
    resultado = soma + 8
else:
    resultado = soma - 5

# Saída
print(f"O número a ser apresentado é: {resultado}")
