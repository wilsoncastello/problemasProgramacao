frase = input("Digite uma frase: ")
fraseSemEspaco = frase.replace(" ", "")
fraseLower = fraseSemEspaco.lower()

vetorContador = [1] * len(fraseLower)
vetorFrase = [0] * len(fraseLower)

for i in range(len(fraseLower)):
  vetorFrase[i] = fraseLower[i]

for i in range(len(fraseLower)):
  for j in range(i+1 , len(fraseLower)):
    if(fraseLower[i] == fraseLower[j]):
      vetorContador[i] = vetorContador[i] + 1
      vetorFrase[j] = None


      

for i in range(len(fraseLower)):
  if((vetorContador[i] > 1) and (vetorFrase[i] != None)):
    print("A letra " + vetorFrase[i] + " aparece " + str(vetorContador[i]) + " vezes")