# Entrada de valores
idade = int(input("Digite a idade: "))
peso = float(input("Digite o peso: "))


# Verificação do grupo
grupo = 9

if idade >= 20:
    grupo -= 3
    if idade > 50:
        grupo -= 3

if peso >= 60:
    grupo -= 1
    if peso > 90:
        grupo -=1

# Saída
print(f"O grupo de risco da pessoa é: {grupo}")

