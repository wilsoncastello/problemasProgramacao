"""
Faça um programa que leia dois numeros reais e imprima o quadrado da diferença do primeiro valor pelo segundo e a diferença dos quadrados.
"""

n1 = float(input("Digite um numero real: "))
n2 = float(input("Digite outro numero real: "))

QuadradoDiferenca = (n1 - n2)**2
DiferencaQuadrados = (n1**2) - (n2**2)

print("O quadrado da diferença de n1 para n2: " + str(QuadradoDiferenca))
print("A diferença do quadrado de n1 para o quadrado de n2: " +
      str(DiferencaQuadrados))