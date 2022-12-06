# Declaração de variáveis
num = 6
idade = []
peso = []
altura = []
olhos = []
cabelo = []
condicao1 = 0
condicao2 = 0
condicao2_numero = 0
condicao3 = 0
condicao4 = 0

# Entrada de valores
for n in range(num):
    idade.append(int(input(f"Digite a idade da {n+1} pessoa : ")))
    peso.append(float(input(f"Digite o peso da {n+1} pessoa (em quilos): ")))
    altura.append(
        float(input(f"Digite a altura da {n+1} pessoa (em metros): ")))
    olhos.append(str(input(
        f"Digite a cor dos olhos da {n+1} pessoa (A-azul; P-preto; V-verde; C-castanho): ")))
    cabelo.append(str(input(
        f"Digite a cor do cabelo da {n+1} pessoa (P-preto; C-castanho; L-louro; e R-ruivo): ")))


# Cálculo das condições
for n in range(num):
    if idade[n] > 50 and peso[n] < 60:
        condicao1 += 1
    if altura[n] < 1.5:
        condicao2 += idade[n]
        condicao2_numero += 1
    if olhos[n].upper() == 'A' or olhos[n].upper() == 'AZUL':
        condicao3 += 1
    elif cabelo[n].upper() == 'R' or cabelo[n].upper() == 'RUIVO':
        condicao4 += 1
if condicao2_numero > 0:
    condicao2 /= condicao2_numero
condicao3 /= 0.06

# Saída
print(
    f"A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg é: {condicao1}")
print(
    f"A média das idades das pessoas com altura inferior a 1,50m é: {condicao2}")
print(f"A porcentagem de pessoas com olhos azuis é: {condicao3}%")
print(
    f"A quantidade de pessoas ruivas e que não possuem olhos azuis é: {condicao4}")
