texto = input("Escreve o texto uma palavra cada: ")

s = []
while texto!=".":
    s.append(texto)
    texto = input("Escreve o texto uma palavra cada: ")

s.sort(reverse=False)

for i in range(0,len(s)):
    print(s[i])