frase = input("Informe a frase a ser separada: ")

fraseLista = frase.split()
tamanho = len(fraseLista)

for i in range (0, tamanho):
    print(fraseLista[i])
