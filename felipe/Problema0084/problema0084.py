a = int(input("Digite A: "))
b = int(input("Digite B: "))
c = int(input("Digite C: "))

if(a > b) & (a > c):
    print("'A' é o maior número.")
elif(b > a) & (b > c):
    print("'B' é o maior número.")
else:
    print("'C' é o maior número.")
