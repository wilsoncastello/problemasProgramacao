vetor = [0] * 15
existe30 = False

for i in range(15):
  vetor[i] = int(input("Digite o elemento inteiro da posiçao " +str(i) + ": "))

print("Posiçoes do vetor onde o valor armazenado é igual a 30")
for i in range(15):
  if(vetor[i] == 30):
    existe30 = True
    print("Posição : " + str(i))

if(existe30 == False):
    print("Nenhuma posição contem o valor igual a 30")