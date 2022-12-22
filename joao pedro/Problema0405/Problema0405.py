
notas=[]
tipo=[]
resultado=[]
nota=0
t=""

print("Digite 3 notas: ")
for i in range (3):
        nota=float(input(""))
        notas.insert(i,nota)
print("Digite 'A' para media aritmetica ou 'P' para media ponderada: ")
t=input("")

def Media(notas,t):
    
    if(t.endswith("P") or t.endswith("p")):
        notas[0]=notas[0]*5
        notas[1]=notas[1]*3
        notas[2]=notas[2]*2
        notas[0]=(notas[0]+notas[1]+notas[2])/10

    else:

        notas[0]=(notas[0]+notas[1]+notas[2])/3
    












Media(notas,t)
print("Resultado: ",notas[0])



