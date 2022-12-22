def converterRad(x):
    return x * (3.14/180)

graus = float(input("Digite o valor em graus para a conversão em radianos: "))

rad = converterRad(graus)
print(f"Radianos: {rad}")