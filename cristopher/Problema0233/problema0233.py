resultado = 0
i = 0

numero = int(input("Digite um numero: "))
vezes = int(input("Digite por quantas vezes quer multiplicar este numero: "))

while(i < vezes):
    resultado = resultado + numero
    i= i + 1

print(f"O resultado de {numero}x{vezes} é: {resultado} ")
