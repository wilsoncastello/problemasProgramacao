"""
Elabore um algoritmo que tome como entrada três valores e os imprima em ordem crescente.
"""

n1 = float(input("Digite um primeiro valor: "))
n2 = float(input("Digite um segumdo valor: "))
n3 = float(input("Digite um terceiro valor: "))

if(n1 <= n2 and n2 <= n3):
    print("Ordem crescente: " + str(n1) + ", " + str(n2) + ", " + str(n3))
    
elif (n1 <= n3 and n3 <= n2):
    print("Ordem crescente: " + str(n1) + ", " + str(n3) + ", " + str(n2))
        
elif(n2 <= n1 and n1 <= n3):
    print("Ordem crescente: " + str(n2) + ", " + str(n1) + ", " + str(n3))
            
elif(n2 <= n3 and n3 <= n1):
    print("Ordem crescente: " + str(n2) + ", " + str(n3) + ", " + str(n1))
                 
elif(n3 <= n1 and n1 <= n2):
    print("Ordem crescente: " + str(n3) + ", " + str(n1) + ", " + str(n2))
                    
else:
    print("Ordem crescente: " + str(n3) + ", " + str(n2) + ", " + str(n1))
                        
