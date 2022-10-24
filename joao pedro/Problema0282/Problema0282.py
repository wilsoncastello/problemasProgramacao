nomes=[]
x=0

for i in range (5):
    print("Digite um nome na posicao ",i,": ")
    nome=input("")
    nomes.insert(i,nome)
print("Digite mais um nome: ")
digite=input("")

for i in range(5):
    if(digite==nomes[i]):
        print("O mesmo nome e encontrado na posicao: ",i)
        x+=1
if x==0:
    print("Nome nao encontrado")



