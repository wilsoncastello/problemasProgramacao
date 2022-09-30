import math

#Dados N pares de pontos do tipo A ( x1, y1 ) e B ( x2 , y2 ) , faça um algoritmo que : 
# a ) Para cada par , calcule e mostre a distância entre os pontos ; 
# b ) Calcule e mostre a soma das distâncias menores que 10.0 ; 
# c ) Determine e mostre a quantidade de pares cuja distância está entre 10.0 e 18.0 ( inclusive extremos ) ; 
# d ) Forneça o valor da maior distância .

quantP = int(input("Digite a quantidade de pares de pontos: "))

dMaior = 0
contPares1018 = 0 
somaD = 0

for i in range(0, quantP):
    print("Digite as coordenadas do ponto ",(i+i))
    x1 = float(input("Digite o x: "))
    y1 = float(input("Digite o y: "))
    print("")
    print("Digite as coordenadas do ponto ",(i+i+1))
    x2 = float(input("Digite o x: "))
    y2 = float(input("Digite o y: "))

    dp = math.sqrt(math.pow(x2 - x1, 2) + math.pow(y2 - y1, 2))

    print("Distancia entre o Ponto {} e {}: {}".format((i+i), (i+i+1), dp))

    if(dp < 10):
        somaD = somaD + dp
    
    elif(dp >= 10 and dp <= 18):
        contPares1018 = contPares1018 + 1
        

    if(dp > dMaior):
        dMaior = dp

print("")
print("Soma das distâncias menores que 10: ",somaD)
print("Quantidade de pares cuja distância está entre 10 e 18: ",contPares1018)
print("Valor da maior distância: ",dMaior)
    
    