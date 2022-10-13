arrecado = 0

for x in range(10):
    nome = input("Ecrever o nome: ")
    pagar = float(input("Valor a pagar: "))

    if( pagar >= 250):
        print("Nome cliente: ",nome)
        print("Valor compar: ",pagar)
        print("Desconto: 20%")
        pDescontado = (pagar*80)/100
        print("Valor descontado: ",pDescontado)
        arrecado = arrecado + ((pagar*20)/100)

    else:
        print("Nome cliente: ",nome)
        print("Valor compar: ",pagar)
        print("Desconto: 15%")
        pDescontado = (pagar*85)/100
        print("Valor descontado: ",pDescontado)
        arrecado = arrecado + ((pagar*15)/100)

print("Total arrecado: ",arrecado)
            