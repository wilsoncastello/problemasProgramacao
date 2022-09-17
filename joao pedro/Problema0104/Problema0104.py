print("Digite 3 numeros em ordem crescente (Sem repeticoes):")
n1=float(input("Numero 1: "))
n2=float(input("Numero 2: "))
n3=float(input("Numero 3: "))
print("Digite um numero (Sem repetir os anteriores):")
n4=float(input("Numero 4: "))

if n4 > n3: 
            print("Numeros em ordem decrescente: " , n4 , " , " , n3 , " , " , n2 , " , " , n1)

else:
            if n3 > n4 and n4 > n2:
                print("Numeros em ordem decrescente: " , n3 , " , " , n4 , " , " , n2 , " , " , n1)

            else:
                if n3 > n4 and n2 > n4 and n4 > n1:
                    print("Numeros em ordem decrescente: " , n3 , " , " , n2 , " , " , n4 , " , " , n1)

                else: 
                    print("Numeros em ordem decrescente: " , n3 , " , " , n2 , " , " , n1 , " , " , n4)

                

            

        