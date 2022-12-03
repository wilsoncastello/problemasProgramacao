jogadasDado =[0] *20

print("Digite os valores que saíram nas jogadas do dado(1 ao 6)")
for i in range(20):
  jogadasDado[i] = input("valor do dado na jogada nº "+str(i) + ": ")

cont1 =0; cont2 =0; cont3 =0; cont4=0; cont5=0; cont6=0
for i in range(20):
  if(int(jogadasDado[i]) == 1):
    cont1 = cont1 + 1

  elif(int(jogadasDado[i]) == 2):
    cont2 = cont2 + 1

  elif(int(jogadasDado[i]) == 3):
    cont3 = cont3 + 1

  elif(int(jogadasDado[i]) == 4):
    cont4 = cont4 + 1

  elif(int(jogadasDado[i]) == 5):
    cont5 = cont5 + 1

  elif(int(jogadasDado[i]) == 6):
    cont6 = cont6 + 1

print("Frequência do numero 1: "+str(cont1))
print("Frequência do numero 2: "+str(cont2))
print("Frequência do numero 3: "+str(cont3))
print("Frequência do numero 4: "+str(cont4))
print("Frequência do numero 5: "+str(cont5))
print("Frequência do numero 6: "+str(cont6))