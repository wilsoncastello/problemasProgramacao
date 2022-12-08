letra = [0] * 26
ASCII = [0] * 26

letra[0] = "a"; letra[1] = "b"; letra[2] = "c"; letra[3] = "d"; letra[4] = "e"; letra[5] = "f"; letra[6] = "g"; letra[7] = "h"; letra[8] = "i"; letra[9] = "j"; letra[10] = "k"
letra[11] = "l"; letra[12] = "m"; letra[13] = "n"; letra[14] = "o"; letra[15] = "p"; letra[16] = "q"; letra[17] = "r"; letra[18] = "s"; letra[19] = "t"; letra[20] = "u"
letra[21] = "v"; letra[22] = "w"; letra[23] = "x"; letra[24] = "y"; letra[25] = "z"

j=0
for i in range(65, 91):
    ASCII[j] = str(i) + " "
    j = j+1

mensagem = input("Digite uma mensagem: ")
novaMensagem = mensagem.lower()
print("Mensagem digitada: "+novaMensagem)

for i in range(26):
    novaMensagem = novaMensagem.replace(letra[i], str(ASCII[i]))

print("Mensagem criptografada: "+novaMensagem)


for i in range(26):
    novaMensagem = novaMensagem.replace(str(ASCII[i]), letra[i])

print("Mensagem descriptografada: "+novaMensagem)

        