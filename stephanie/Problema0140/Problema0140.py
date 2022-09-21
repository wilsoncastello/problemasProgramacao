n = input("Digite um número inteiro que esteja na faixa de valores de 1 até 9: ")
if int(n)>=1:
    if int(n)<=9:
        print("O valor está na faixa permitida")
    else:
        print("O valor está fora da faixa permitida")
else:
    print("O valor está fora da faixa permitida")