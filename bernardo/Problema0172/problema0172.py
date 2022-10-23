# Entrada de valores
soma = 0
num = 0
idade = 42

while idade != 0:
    num += 1
    idade = int(input(f"Digite a {num} idade (digite 0 para finalizar): "))
    soma += idade


# Cálculo da média das idades
if num != 1:
    num -= 1
media = soma / num

# Saída
print(f"A media das idades é: {media}")
