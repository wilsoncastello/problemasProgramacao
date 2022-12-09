frase1 = input("Digite a primeira frase: ")
frase2 = input("Digite a segunda frase: ")
frase3 = ""
palavra1 = frase1.split()
palavra2 = frase2.split()
if(palavra1 >= palavra2):
    maiorFrase = len(palavra1)
else:
    maiorFrase = len(palavra2)
for i in range(maiorFrase):
    if(i < len(palavra1)):
        frase3 += palavra1[i] + ' '
    if(i < len(palavra2)):
        frase3 += palavra2[i] + ' '
print(frase3)