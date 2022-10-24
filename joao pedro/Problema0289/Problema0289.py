numero=[]
lugares=[]
vago=[]
pedidos=[]
x=0
y=0

n=int(input("Digite a quantidade de voos: "))

for i in range (n):
    print("Digite o numero do voo ",i,": ")
    numeros=int(input())
    numero.insert(i,numeros)
    print("Digite a quantidade de lugares disponiveis no voo",i,": ")
    lugar=int(input())
    lugares.insert(i,lugar)
    if lugares[i]<=0:
        print("Voo lotado")
        
    for j in range (lugares[i]):
        print("Deseja realizar uma reserva para o voo ",i," ?([1]Sim/[2]Nao/[-1]Para encerrar]): ")
        x=int(input())
        if x==1:
            if y==0:
                pedidos.insert(i,0)
                
                y=1
            if y==1:
                pedidos[i]+=1
            
            print("** Pedido efetuado **")
        if x==-1:
            print("** Encerrando programa **")
            exit()
    y=0
    
for k in range (n):
    vago.insert(k,0)
    if lugares[k]!=0:
        
        vago[k]=lugares[k]-pedidos[k]
        print("Numero do voo: ",numero[k])
        print("Passageiros: ",pedidos[k])
        print("Lugares vagos: ",vago[k])
    if lugares[k]==0:
        print("Numero do voo: ",numero[k])
        print("Passageiros: 0")
        print("Lugares vagos: 0")