def ehPrimo(n):
    if n < 2:
        return False
    for i in range(2, n):
        if(n % i == 0):
            return False
    return True

qtd = int(input("Quantos numeros deseja verificar: "))
for i in range(0, qtd):
    numero = int(input("Digite um numero par maior que 2: "))

    if numero % 2 == 0 and numero > 2:
        encontrado = False
        for i in range(2, numero):
            if ehPrimo(i):
                j = numero - i
                if ehPrimo(j):
                    encontrado = True
                    if i <= j:
                        print(f"{numero} = {i} + {j}")
                        break
        if not encontrado:
            print("Não foi encontrado nenhum primo.")
    else:
        print("Número inválido.")