vetor= []
i = 0
while(i < 10):
    vetor[i] = input("Digite um número: ")
j = 0
while(vetor[j]>0 and j<10):
    j=j+1
if(j==9):
    print("Não existem valores negativos")
else:
    print("O número negativo está na posição: "+j)

