# Entrar com 20 números e imprimir a soma dos números cujos quadrados são menores do que 225.

somador = 0

for x in range(20):

    numero = int(input("Digite o {}º numero: ".format(x+1)))

    if ((numero * numero) < 225):
        somador = somador + numero

print("A soma dos numeros cujo quadrado é menor do que 225 é: {}".format(somador))
