def calculaFatorial(a):
    fat=1
    i=0
    j = 1
    while(i<a.size()):
        n = a[i]
        while (i<=n):
            fat = fat*i
        b[i] = fat
        i+=1
        j+=1
    return b


a = []
b = []
i=0
while(i<5):
    a[i] = input("Digite um número inteiro par calcular o fatorial: ")
    i+=1
b = calculaFatorial(a)
print("Vetor resultado")
i=0
while(i<5):
    print(b[i])
    i+=1