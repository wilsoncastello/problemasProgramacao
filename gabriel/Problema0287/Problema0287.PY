vetorA = [0] * 10
vetorB = [0] * 10
vetorOperacoes =[0] * 10
vetorResultado = [0] * 10

print("Digite os dados do vetor A")
for i in range(10):
  vetorA[i] = float(input("Digite o valor da posição "+str(i)+ ": "))

print("Digite os dados do vetor B")
for i in range(10):
  vetorB[i] = float(input("Digite o valor da posição "+str(i)+ ": "))
  

print("Digite os dados do vetor das operações matemáticas")
for i in range(10):
  vetorOperacoes[i] = input("Digite a operação da posição "+str(i)+ ": ")

for i in range(10):
  if(vetorOperacoes[i] == '+'):
    vetorResultado[i] = vetorA[i] + vetorB[i]

  elif(vetorOperacoes[i] == '-'):
    vetorResultado[i] = vetorA[i] - vetorB[i]

  elif(vetorOperacoes[i] == '*'):
    vetorResultado[i] = vetorA[i] * vetorB[i]

  elif(vetorOperacoes[i] == '/' and vetorB[i] != 0):
    vetorResultado[i] = vetorA[i] / vetorB[i]

  elif(vetorOperacoes[i] == '/' and vetorB[i] == 0):
    vetorResultado[i] = None

  else:
    vetorResultado[i] = None

print(vetorResultado)