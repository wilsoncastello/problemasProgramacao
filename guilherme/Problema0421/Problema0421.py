def primo(n):
    ehPrimo = True
    for i in range(2, n):
        if(n % i == 0):
            ehPrimo = False
    if(ehPrimo == False):
        print("O número",n,"não é primo!")
    else:
        print("O número",n,"é primo!")

n = int(input("Digite um número: "))
primo(n)