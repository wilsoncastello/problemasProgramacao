
import math


x = int(input("Digite um numero positivo maior que zero: "))
quadrado=x**2
cubo=x**3
raizQuadrada=math.sqrt(x)
raizCubica=x**(1/3)


print(str(x)+" ao quadrado: "+str(quadrado))
print(str(x)+" ao cubo: "+str(cubo))
print("A raiz quadrada de "+str(x)+": "+str(raizQuadrada))
print("A raiz cubica de "+str(x)+": "+str(raizCubica))