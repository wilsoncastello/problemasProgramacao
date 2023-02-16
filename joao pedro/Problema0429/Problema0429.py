def funcao(x,y,n):
    i=0
    while(i<n):
        print("Digite um valor para o vetor de numeros (posicao ",i,"): ")
        a=int(input(""))
        x.insert(i,a)
        i+=1
    i=0
    while(i<n):
        print("Digite um valor para o vetor de caracteres (posicao ",i,"): ")
        b=input("")
        y.insert(i,b)
        i+=1
    i=0
    while(i<n):
        print(x[i]*y[i])
        i+=1
    



def main():
    n=int(input("Digite o tamanho dos vetores: "))
    x=[n]
    y=[n]
    funcao(x,y,n)

main()