a = 0
numerador = -1
denominador = 0

for i in range(1,25):
    numerador = numerador + 2
    denominador = i

a = a + (numerador/denominador)

print("A = 49/25 = " + str(a))