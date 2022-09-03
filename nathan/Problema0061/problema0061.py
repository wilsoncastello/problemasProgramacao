abcissa = float(input("Digite o valor da abcissa: "))
ordenada = float(input("Digite o valor da ordenada: "))

quadrante2 = bool

if abcissa < 0 and ordenada > 0:
    quadrante2 = True
else:
    quadrante2 = False

print("O ponto está no quadrante 2? ", quadrante2)