vetorNome = [0] * 10
vetorCPF = [0] * 10
vetorProfissao = [0] * 10
vetorContador = [1] * 10


for i in range(10):
  vetorNome[i] = input("Digite o nome da pessoa da posição " + str(i) + ": ")
  vetorCPF[i] = input("Digite o cpf de "+vetorNome[i]+ ": ")
  vetorProfissao[i] = input("Digite a profissão de "+vetorNome[i]+ ": ")

for i in range(10):
  
  for j in range(i+1, 10):
    if(vetorProfissao[i] == vetorProfissao[j]):
      vetorContador[i] = vetorContador[i] + 1
      vetorProfissao[j] = None

for i in range(10):
  if(vetorProfissao[i] != None):
    print("Profissão "+vetorProfissao[i] + ": " + str(vetorContador[i]))