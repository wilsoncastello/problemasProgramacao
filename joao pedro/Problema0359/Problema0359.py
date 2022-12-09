print("Lista de alunos (Digite '#' para concluir a lista): ")

nomes=[]
sala120=""
sala121=""
sala122=""
nome=""
i=0
while nome !="#":
    print("Nome do aluno ",i,": ")
    nome=input("")
    nomes.insert(i,nome)
    if (nomes[i][0] >= 'A' and nomes[i][0] <= 'K') :
                sala120 = nomes[i] + "  " + sala120
    if (nomes[i][0] >= 'L' and nomes[i][0] <= 'N') :
                sala121 = nomes[i] + "  " + sala121
    if (nomes[i][0] >= 'O' and nomes[i][0] <= 'Z') :
                sala122 = nomes[i] + "  " + sala122
    i+=1

print("Alunos na sala 120: "+sala120)
print("Alunos na sala 121: "+sala121)
print("Alunos na sala 122: "+sala122)