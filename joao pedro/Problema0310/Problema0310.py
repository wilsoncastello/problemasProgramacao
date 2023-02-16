vetorA=[]
vetor=0
impar=0
for i in range (10):
    print("Digite um numero para o vetor A de posicao ",i,": ")
    vetor=int(input(""))
    vetorA.insert(i,vetor)
    if vetor%2==1:
        impar+=1

porcentagem=impar*0.1

print("Quantidade de numeros impar: ",impar)
print("Porcentagem de numeros impar: ",porcentagem)