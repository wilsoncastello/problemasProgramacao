n = int(input("Digite um valor inteiro: "))
soma = 0
resto = n % 10
n = n // 10
soma = soma + resto
resto = n % 10
n = n // 10
soma = soma + resto
resto = n % 10
n = n // 10
soma = soma + resto
print("A soma dos digitos é igual a:", soma)