#Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.
nota1 = float(input("Digite a primeira nota: "))
peso1 = float(input("Agora, digite o peso da primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
peso2 = float(input("Agora, digite o peso da segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))
peso3 = float(input("Agora, digite o peso da terceira nota: "))

notaFinal = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3)

print(f"O resultado da média ponderada é: {notaFinal}")