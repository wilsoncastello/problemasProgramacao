def tirarRaiz(radicando, indice):
    
  raiz = -1
  variavel = 1
  for i in range(int(radicando)):
    variavel = 1
    for j in range(indice):
      variavel = variavel * i

    if(variavel == radicando):
      raiz = i
      break
    
  return raiz

radicando = int(input("Digite o radicando inteiro: "))
while(radicando < 0):
  print("valor invalido")
  radicando = int(input("Digite o radicando inteiro: "))

indice = int(input("Digite o indice: "))
while(indice < 2):
  print("valor invalido")
  indice = int(input("Digite o indice: "))

  
raiz = tirarRaiz(radicando, indice)

if(radicando == 0):
    print("Resultado: 0")

elif(radicando == 1):
    print("Resultado: 1")

elif(raiz == -1):
    print("Não existe raiz exata") 

else: 
    print("Resultado: "+str(raiz))