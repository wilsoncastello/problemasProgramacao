#Escreva um algoritmo que tome como entrada um valor
#inteiro expresso na base 10 e imprima o valor correspondente na base 2.
 
num = int(input("Digite um numero: "))
binario = list()
i = 0
 
numDiv = num/2
 
while(numDiv != 0):    
    if(numDiv.is_integer()):
        binario.insert(0, 0)
    else:
        binario.insert(0, 1)
   
    numBin = int(numDiv)
    numDiv = numBin/2
   
 
print(binario)