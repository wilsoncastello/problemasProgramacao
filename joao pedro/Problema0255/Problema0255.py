vetor=[]

for i in range (10):
    print("Digite um numero inteiro de posicao ",i)
    numero=int(input(""))
    vetor.insert(i,numero)
    

print("Vetor em ordem decrescente: ")
print(sorted(vetor,reverse=True))

