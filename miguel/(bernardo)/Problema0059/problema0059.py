# Entrada de valores
ano = int(input("Digite o ano: "))

# Verificação do ano
bissexto = (ano % 4 == 0 and not (ano % 100 == 0) or ano % 400 == 0)

# Saída
print(f"O ano é bissexto: {bissexto}")
