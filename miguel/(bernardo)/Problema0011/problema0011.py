# Entrada de valores
ano = int(input("Digite o ano atual: "))
nascimento = int(input("Digite o ano de nascimento: "))

# Cálculo da idade e da idade em 2050
idade = ano - nascimento
idade_futura = 2050 - nascimento

# Saída
print(f"A idade da pessoa é {idade}")
print(f"A idade da pessoa em 2050 será {idade_futura}")