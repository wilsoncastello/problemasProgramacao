import math

# Entrada de valores

print("Menu de opções: \n1. Somar dois números. \n2. Raiz quadrada de um número.")
opcao = int(input("Digite a opção desejada: "))

# Cálculo das operações
if opcao == 1:
    numero1 = float(input("Digite o primerio número: "))
    numero2 = float(input("Digite o segundo número: "))
    resultado = numero1 + numero2
elif opcao == 2:
    numero1 = float(input("Digite um número: "))
    resultado = math.sqrt(numero1)
else:
    print("Operação não reconhecida")
    resultado = 0

# Saída
print(f"O resultado da operação é: {resultado}")
