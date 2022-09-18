x = int(input("Digite um número para a abscissa: "))
y = int(input("Digite um número para a coordenada: "))
quadrante = 0

if(x >= 0 and y >= 0):
    quadrante = 1
elif(x < 0 and y >= 0):
    quadrante = 2
elif(x < 0 and y < 0):
    quadrante = 3
elif(x >= 0 and y < 0):
    quadrante = 4

print("O ponto está localizado no %sº quadrante"%(quadrante))