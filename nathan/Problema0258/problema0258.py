qVoos = int(input("Quantidade de voos oferecidos: "))
vN = []
vOrigem = []
vDestino = []
vLugares = []

for i in range(0, qVoos):
    n = int(input("Número do voo %d:" %(i+1)))
    vN.append(n)
    n = input("Origem do voo %d:" %(i+1))
    vOrigem.append(n)
    n = input("Destino do voo %d:" %(i+1))
    vDestino.append(n)
    n = int(input("Lugares disponíveis do voo %d:" %(i+1)))
    vLugares.append(n)

resposta = int(input("\nSELECIONE UMA OPÇÃO \n1- Consultar; \n2- Efetuar Reserva; \n3- Sair.\n"))

while resposta != 3:
    if resposta == 1:
        consulta = int(input("\nSELECIONE UMA CONSULTA \n1 - Pelo número do voo; \n2 - Pela origem; \n3 - Por destino."))
        if consulta == 1:
            nVoo = int(input("Digite o numero do voo: "))
            for i in range(0, qVoos):
                if vN[i] == nVoo:
                    print("Numero do voo: %d" %nVoo)
                    print("Origem do voo: ", vOrigem[i])
                    print("Destino do voo: ", vDestino[i])
                    print("Lugares disponíveis no voo: %d" %vLugares[i])
        elif consulta == 2:
            origem = input("Digite a origem : ")
            if vOrigem[i] == origem:
                print("Numero do voo: %d" %vN[i])
                print("Origem do voo: ", origem)
                print("Destino do voo: ", vDestino[i])
                print("Lugares disponíveis no voo: %d" %vLugares[i])
        elif consulta == 3:
            destino = input("Digite o destino: ")
            if vOrigem[i] == origem:
                print("Numero do voo: %d" %vN[i])
                print("Origem do voo: ", vOrigem[i])
                print("Destino do voo: " ,destino)
                print("Lugares disponíveis no voo: %d" %vLugares[i])
    elif resposta == 2:
        vooReserva = int(input("Numero do voo para a reserva: "))
        vooReservaB = False
        for i in range(0, qVoos):
            if vN[i] == vooReserva:
                vooReservaB = True
                if vLugares[i] > 0:
                    print("Reserva confirmada.")
                    vLugares[i] = vLugares[i] - 1
                else:
                    print("Voo lotado.")
        if vooReservaB == False:
            print("Voo inexistente.");    

    resposta = int(input("\nSELECIONE UMA OPÇÃO \n1- Consultar; \n2- Efetuar Reserva; \n3- Sair."))            
