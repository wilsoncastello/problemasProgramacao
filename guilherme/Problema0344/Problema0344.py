nomeAbreviado = ""
ultimoEspaco = 0
nome = input("Digite um nome: ")
nomeAbreviado = nome[0:nome.index(" ")]
for i in range(len(nome)):
    if(nome[i] == ' '):
        ultimoEspaco = i
for i in range(len(nome)):
    if(nome[i] == ' ' and i != ultimoEspaco):
        nomeAbreviado += nome[i:i+2].upper() + "."
nomeAbreviado += nome[ultimoEspaco:]
print(nomeAbreviado)