import math


angulo=float(input("Digite um angulo: "))

if (angulo >= 90 and angulo <= 180) or (angulo >= 270 and angulo <= 360):
            seno=math.sin(math.radians(angulo))
            print("Seno de " , angulo , ": " , seno)

else: 
            cosseno=math.cos(math.radians(angulo))
            print("Cosseno de " , angulo , ": " , cosseno)

        