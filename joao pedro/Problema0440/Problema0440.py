def funcao(x,i,z):
    if z==1:
        return i
    else:
        return -1


def main():
    print("Digite '1111' para parar")
    x=[]
    i=0
    z=0
    y=0
    a=0
    h=0
    while(y!=1111):
        print("Digite um valor para a posicao ",i,": ")
        y=float(input(""))
        x.insert(i,y)
        if x[i]<0 and z!=1:
            z=1
            h=i
            funcao(x,i,z)
        i+=1    
    for y in range (i):
        if z==0:
            a=y
            funcao(x,y,z)
    if(z==0):
        print(funcao(x,a,z))
    else:
        print(funcao(x,h,z))

main()

        


    