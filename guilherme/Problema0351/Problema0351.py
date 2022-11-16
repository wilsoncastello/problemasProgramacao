cont = 0
frase = input("Digite uma frase: ")
x = input("Digite um caractere para buscar na frase: ")
for i in range(len(frase)):
    if(frase[i]== x):
        cont += 1
if(cont == 1):
    print("\'{}\' é encontrado na frase.".format(x))
    print("É encontrado na posição: ")
    for i in range(len(frase)):
        if(frase[i] == x):
            print("{}; ".format(i))
        

elif(cont > 1):
    print("\'{}\' é encontrado na frase {} vezes.".format(x, cont))
    print("Pode se encontrado nas posições: ")
    for i in range(len(frase)):
        if(frase[i] == x):
            print("{}; ".format(i))
else:
    print("\'{}\' não pode ser encontrado na frase.".format(x))