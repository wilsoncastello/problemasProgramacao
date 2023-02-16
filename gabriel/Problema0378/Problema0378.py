matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]
soma = float(0); media = (0); contador = float(0)


for i in range(4):
  for j in range(3):
    matriz [i][j] = float(input("Digite o valor da linha " + str(i) + " e a coluna "+str(j) + ": "))

for i in range(4):
  for j in range(3):
    if(i % 2 == 0):
      soma = soma + matriz[i][j]
      contador = contador + 1

media = soma / contador

print("A media dos elementos das linhas pares: "+ str(media))