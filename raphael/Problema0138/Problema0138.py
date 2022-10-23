# Elaborar um programa que leia um valor inteiro qualquer e apresente esse valor somente se for divisível por 2 ou somente se for divisível 3. Caso contrário, não faça nada. Esse valor pode ser apresentado caso seja divisível por 2 e 3.

valor = int(input("Digite um valor inteiro qualquer: "))

if valor % 3 == 0:
    print(valor)
elif valor % 2 == 0:
    print(valor)