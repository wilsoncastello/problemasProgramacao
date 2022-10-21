n =  int(input("Digite o numero de termos da serie: "))
h = 0

for i in range(1,n+1):
    h = h + 1/i
    print(h)