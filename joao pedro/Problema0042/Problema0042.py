import math


angulo=float(input("Digite um angulo: "))

seno=math.sin(math.radians(angulo))
cosseno=math.cos(math.radians(angulo))
tangente=math.tan(math.radians(angulo))
secante=math.pow(cosseno,-1)
cossecante=math.pow(seno,-1)
cotangente=math.pow(tangente,-1)

print("Seno de ",angulo,": ",seno)
print("Cosseno de ",angulo,": ",cosseno)
print("Tangente de ",angulo,": ",tangente)
print("Secante de ",angulo,": ",secante)
print("Cossecante de ",angulo,": ",cossecante)
print("Cotangente de ",angulo,": ",cotangente)