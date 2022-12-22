vetorX=[]
check=0

numero=0
n=int(input("Digite o tamanho do vetor X: "))
i=n
j=n
for n in range (n):
    numero=float(input("Digite um numero para o vetor X: "))
    vetorX.insert(n,numero)

y=float(input("Digite um numero para Y: "))

for j in range (j):
    if y==vetorX[j]:
        check=1
        print("O numero de Y exite no vetor X")

if check==0:
    print("O numero de Y nao esta no vetor X. Inserindo valor de Y")
    vetorX[0]=y

for i in range (i):
    print("Vetor X na posicao ",i,": ",vetorX[i])


