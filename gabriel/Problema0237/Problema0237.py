n = int(input("Digite um numero inteiro: "))
soma = int(0)
resto = int(1)

while (resto>0):

    resto = n % 10
    n = (n - resto) / 10

    soma= soma + resto

print("Soma dos alagarismos do numero: " + str(soma))
