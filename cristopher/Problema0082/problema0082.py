numero1 = int(input("Digite o primeiro numero inteiro: "))
numero2 = int(input("Digite o segundo numero inteiro: "))

if (numero1 % numero2 == 0 or numero2 % numero1 == 0):
    print("São múltiplos.")
else:
    print("Não são múltiplos.")
