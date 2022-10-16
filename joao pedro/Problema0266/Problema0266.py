


print("--Digite 15 numeros--")
vetor15=[]
vetorP=[]
vetorI=[]
numero=0
x=0
y=0


for i in range (15):
    print("Numero de posicao ",i,": ")
    numero=int(input(""))
    vetor15.insert(i,numero)
    if vetor15[i]%2==0 and x<5:
        vetorP.insert(x,vetor15[i])
        x+=1
    elif vetor15[i]%2==1 and y<5:
        vetorI.insert(y,vetor15[i])
        y+=1
    

    
    if x>=5:
        print("Vetor P esta cheio!")
        print(vetorP)
        print("--Recomecando vetor P--")
        x=0
        z=1
        
    if y>=5:
        print("Vetor I esta cheio!")
        print(vetorI)
        print("--Recomecando vetor I--")
        y=0
        

print("Vetor P final: ")
print(vetorP[:5])
print("Vetor I final: ")
print(vetorI[:5])

