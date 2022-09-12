import math

numero = float(input("Coloque aqui um número real (Use . ao inves de , ). \nDigite: "))

resultado = math.modf(numero)

print("Parte inteira: ",resultado[1])
print("Parte frácionaria: ",resultado[0])
print("Número arredondado: ",round(numero))