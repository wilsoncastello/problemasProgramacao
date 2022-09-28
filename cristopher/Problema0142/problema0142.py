import math


tamanhoEscada = float(input("Digite o tamanho da escada (em metros): "))
alturaQuadro = float(input("Digite a altura em que se deseja pregar o quadro: "))

if(tamanhoEscada < alturaQuadro):
    print("A escada é muito pequena.")

distanciaBase = math.pow(tamanhoEscada, 2) - math.pow(alturaQuadro, 2)
distanciaBase = math.sqrt(distanciaBase)

print(f"A distância em que a escada deverá ficar: {distanciaBase}")