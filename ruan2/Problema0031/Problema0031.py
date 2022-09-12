#/*Faça um programa que receba o raio, calcule e mostre: 
#a) o comprimento de uma esfera; sabe-se que C = 2 * π R; 
#b) a área de uma esfera; sabe-se que A = 4 π R²; 
#c) o volume de uma esfera; sabe-se que V = 4/3 * π * R³*/

#Entrada de dados
raio = float(input("Digite o valor do raio da esfera: "))

#Processamento
compEsf = 2 * 3.14 * raio
areaEsf = 4 * 3.14 * (raio * raio)
volEsf = 4 * 3.14 * (raio * raio * raio)/3

#Saída de dados
print("")
print("Comprimento da esfera:",compEsf)
print("Área da esfera:",areaEsf)
print("Volume da esfera:",volEsf)