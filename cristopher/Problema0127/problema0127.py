nome = input("Digite o nome do primeiro finalista: ")
pontuacao = float(input("Pontuação: "))

nome2 = input("Digite o nome do segundo finalista: ")
pontuacao2 = float(input("Pontuação: "))

nome3 = input("Digite o nome do terceiro finalista: ")
pontuacao3 = float(input("Pontuação: "))

if(pontuacao > pontuacao2 and pontuacao > pontuacao3):
    print(f"Vencedor: {nome}, {pontuacao} pontos.")
    if(pontuacao2 > pontuacao3):
        print(f"Segundo colocado: {nome2}, {pontuacao2} pontos.")
        print(f"Terceiro colocado: {nome3}, {pontuacao3} pontos.")
    else:
        print(f"Segundo colocado: {nome3}, {pontuacao3} pontos.")
        print(f"Terceiro colocado: {nome2}, {pontuacao2} pontos.")
elif(pontuacao2 > pontuacao and pontuacao2 > pontuacao3):
    print(f"Vencedor: {nome2}, {pontuacao2} pontos.")
    if(pontuacao > pontuacao3):
        print(f"Segundo colocado: {nome}, {pontuacao} pontos.")
        print(f"Terceiro colocado: {nome3}, {pontuacao3} pontos.")
    else:
        print(f"Segundo colocado: {nome3}, {pontuacao3} pontos.")
        print(f"Terceiro colocado: {nome}, {pontuacao} pontos.")   
else:
    print(f"Vencedor: {nome3}, {pontuacao3} pontos.")
    if(pontuacao2 > pontuacao):
        print(f"Segundo colocado: {nome2}, {pontuacao2} pontos.")
        print(f"Terceiro colocado: {nome}, {pontuacao} pontos.")
    else:
        print(f"Segundo colocado: {nome}, {pontuacao} pontos.")
        print(f"Terceiro colocado: {nome2}, {pontuacao2} pontos.")
        
