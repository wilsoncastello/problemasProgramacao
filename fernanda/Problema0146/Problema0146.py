nome1 = str (input ("Digite o primeiro nome: "))
nome2 = str (input ("Digite o segundo nome: "))

if (nome1 < nome2) :
    print(nome1 +", "+ nome2)     
elif (nome1 > nome2) :
    # o nome1 vem depois do nome2
    print(nome2 +", "+ nome1)
else :
    print("Mesma Inicial: "+nome1 +", "+ nome2)
