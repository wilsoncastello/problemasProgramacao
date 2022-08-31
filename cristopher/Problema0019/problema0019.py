from cmath import sin


angulo = int(input("Informe o angulo (em graus): "))

altura = float(input("Informe a altura da parede: "))

radianos = (angulo * 3.14) / 180 

escada = altura / sin(radianos)

print(f"Medida da escada: {escada}")