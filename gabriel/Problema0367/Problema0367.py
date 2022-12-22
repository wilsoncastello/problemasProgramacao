matriz  = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
pontoSela = False
 
for i in range(4):
    for j in range(4):
        matriz [i][j] = int(input("Digite o valor da linha "+str(i)+" e da coluna "+str(j) + ": "));  


for i in range(4):
       
    menorDaLinha = matriz[i][0]
    indiceColuna = 0; indiceLinha = 0
    for j in range(1, 4):
        if (menorDaLinha > matriz[i][j]):
            menorDaLinha = matriz[i][j]
            indiceColuna = j
            indiceLinha = i
 
        
    k = 0
    for k in range(4):
 
            
        if (menorDaLinha < matriz[k][indiceColuna]):
            break
        k += 1
 
    if (k == 4):
        print("Existe um ponto de sela na posição da linha " +str(indiceLinha)+" e da coluna "+str(indiceColuna))
        print("O valor é "+ str(menorDaLinha))
        pontoSela = True

if(pontoSela == False):
    print("Não existe ponto de sela na matriz")

            
 
    
    
 


   
    
    
 
