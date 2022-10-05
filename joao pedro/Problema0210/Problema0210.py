x=int(input("Digite a quantida de produtos comprados: "))
totalP=0.0
totalV=0.0
for x in range(x):
    tipo=input("Digite tipo de compra para o produto ('v' para compras a vista/ 'p' para compras a prazo/ 'x' para encerrar o programa'): ")
    if tipo=="x":
        print("--Finalizando programa--")
        exit()
    valor=float(input("Digite o valor do produto"))
    if tipo.casefold()=="v":
        totalV=totalV+valor
    if tipo.casefold()=="p":
        totalP=totalP+valor

print("Total a vista: ",totalV)
print("Total a prazo: ",totalP)


 
 
 