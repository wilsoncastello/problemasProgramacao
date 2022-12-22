mensagem = input("Digite uma mensagem: ")
mensagemLower = mensagem.lower()

contA = 0; contE = 0; contI = 0; contO = 0; contU = 0;

for i in range(len(mensagem)):
  if(mensagemLower[i] == "a"):
    contA = contA + 1

  elif(mensagemLower[i] == "e"):
    contE = contE + 1

  elif(mensagemLower[i] == "i"):
    contI = contI + 1

  elif(mensagemLower[i] == "o"):
    contO = contO + 1

  elif(mensagemLower[i] == "u"):
    contU = contU + 1

print("Quantidade de 'a' e 'A' na mensagem digitada: " + str(contA))
print("Quantidade de 'e' e 'E' na mensagem digitada: " + str(contE))
print("Quantidade de 'i' e 'I' na mensagem digitada: " + str(contI))
print("Quantidade de 'o' e 'O' na mensagem digitada: " + str(contO))
print("Quantidade de 'u' e 'U' na mensagem digitada: " + str(contU))