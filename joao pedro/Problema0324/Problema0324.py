palavra=input("Digite uma palavra: ")

for i in range (5):
    j=5-i
    while j>1:
        
        print("   ", end=' ')
        j-=1
    k=0
    while k<=i:
        
        print("  ",palavra, end=' ')
        k+=1
    print()
