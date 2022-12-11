def lerDados():
    n = 0
    v = [20]
    
    print("Digite -1 para sair")

    for i in range (len(v)):
        v[i] = int(input("Digite o vetor: "))

        if v[i] > 0:
            n += 1
        else:
            break

        x = [n]
        for i in range (len(x)):
            x[i] = v[i]
        return x

def vetor(v):

    for i in range (len(v)):
        for j in range (i+1,len(v)):
            if v[i] > v[j]:
                temp = v[i]
                v[i] = v[j]
                v[j] = temp
            
    return v[0]

print(vetor(lerDados()))