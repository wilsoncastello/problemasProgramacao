diaAtual = int(input("Escreve o numero do dia atual: "))
mesAtual = int(input("Escreve o numero do mes atual: "))
anoAtual = int(input("Escreve o numero do ano atual: "))

dia = int(input("Escreve o numero do dia: "))
mes = int(input("Escreve o numero do mes: "))
ano = int(input("Escreve o numero do ano: "))

if anoAtual < ano:
    print("Nao esta vencida")
elif anoAtual > ano:
    print("Esta vencida")
else:
    if mesAtual < mes:
        print("Nao esta vencida")
    elif mesAtual > mes:
        print("Esta vencida")
    else:
        if diaAtual <= dia:
            print("Nao esta vencida")
        elif diaAtual > dia:
            print("Esta vencida")
