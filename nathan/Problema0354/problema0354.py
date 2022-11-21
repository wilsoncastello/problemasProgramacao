frase = input("Digite uma frase: ")
novaFrase = " "
for i in frase:
    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
        novaFrase += i.upper()
    else:
        novaFrase += i.lower()
print(novaFrase)