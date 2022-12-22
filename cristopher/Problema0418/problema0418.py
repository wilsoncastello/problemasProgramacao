def conversor(graus):
    radianos = (graus * 3.14) / 180
    return radianos

graus = float(input("Digite o valor (em graus): "))

valorRadianos = conversor(graus)

print(valorRadianos)