frase = input("Digite uma frase contendo numero: ")
vetorFrase_to_array = list(frase)

posicaoNum = 0

for i in range(0, len(frase)):
    if(vetorFrase_to_array[i] == '0' or vetorFrase_to_array[i] == '1' or vetorFrase_to_array[i] == '2' or vetorFrase_to_array[i] == '3' or vetorFrase_to_array[i] == '4' or vetorFrase_to_array[i] == '5' or vetorFrase_to_array[i] == '6' or vetorFrase_to_array[i] == '7' or vetorFrase_to_array[i] == '8' or vetorFrase_to_array[i] == '9'):
        posicaoNum = vetorFrase_to_array[i]

for i in range(0, len(frase)):
    if(vetorFrase_to_array[i] == posicaoNum):
        if(vetorFrase_to_array[i] == '0'):
            print("zero")
        elif(vetorFrase_to_array[i] == '1'):
            print("um")
        elif(vetorFrase_to_array[i] == '2'):
            print("dois")
        elif(vetorFrase_to_array[i] == '3'):
            print("três")
        elif(vetorFrase_to_array[i] == '4'):
            print("quatro")
        elif(vetorFrase_to_array[i] == '5'):
            print("cinco")
        elif(vetorFrase_to_array[i] == '6'):
            print("seis")
        elif(vetorFrase_to_array[i] == '7'):
            print("sete")
        elif(vetorFrase_to_array[i] == '8'):
            print("oito")
        elif(vetorFrase_to_array[i] == '9'):
            print("nove")
    else:
        print(*vetorFrase_to_array[i])


    