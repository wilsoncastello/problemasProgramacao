contPrimos = 0

for x in range(10):
    n = float(input("Digite o um número: "))
    if n % 2 == 0 or n % 3 == 0:
        if n == 2 or n == 3:
            contPrimos = contPrimos + 1
    else:
        contPrimos = contPrimos + 1
print("Quantidade de números primos: ", contPrimos)