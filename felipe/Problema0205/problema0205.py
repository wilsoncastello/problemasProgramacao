n =  int(input("Digite o número de termos: "))
fact = 1

for i in range(1,n+1):
    fact = fact * i
    print(fact)