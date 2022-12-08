palavra = input("Digite uma palavra: ")
palavra2 = input("Digite outra palavra: ")

vetorPalavra = [0] * len(palavra)
vetorPalavra2 = [0] * len(palavra2)
permuta = True

for i in range(len(palavra)):
  vetorPalavra[i] = palavra[i]

for i in range(len(palavra2)):
  vetorPalavra2[i] = palavra2[i]

if(len(palavra) != len(palavra2)):
  permuta = False
        
        
else:
        
  for i in range(len(palavra)):
    for j in range(len(palavra2)):
      if(vetorPalavra[i] == vetorPalavra2[j]):
        vetorPalavra[i] = 0
        vetorPalavra2[j] = 0
                      
                 
           
        
  for i in range(len(palavra)):
    if(vetorPalavra[i] != 0 or vetorPalavra2[i] != 0):
      permuta = False
            
      
print("A primeira palavra é uma permutação da segunda? : "+str(permuta))