y = input("Digite um número:")
print("Divisores:")
i=y
while(i>0):
    if y % i == 0: 
        print(i,", ",end='')
    i=i-1
