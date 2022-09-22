import math


graus = float(input("Digite os graus: "))
minutos = float(input("Digite os minutos: "))
segundos = float(input("Digite os segundos: "))

res = graus + (minutos + segundos/60)/60

res = res * (math.pi/180)

print("Esse ângulo em radianos é: ",res)