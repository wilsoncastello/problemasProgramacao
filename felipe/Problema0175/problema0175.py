while True:
    op = float(input("Menu de opções: \n\t1.Média aritmética \n\t2.Média ponderada \n\t3.Sair. \nDigite a opção desejada: "))

    if(op == 1):
        nota1 = float(input("Insira a primeira nota: "))
        nota2 = float(input("Insira a primeira nota: "))
            
        mediaA = (nota1 + nota2)/2
        print("Média aritmetica: ",mediaA)
    if(op == 2):
        n1 = float(input("Insira a primeira nota: "))
        n2 = float(input("Insira a segunda nota: "))
        n3 = float(input("Insira a terceira nota: "))
        p1 = float(input("Insira o primeiro peso: "))
        p2 = float(input("Insira o segundo peso: "))
        p3 = float(input("Insira o terceiro peso: "))
        mediaP = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3)
        print("Média ponderada: ",mediaP,"\n")
    if(op == 3):
        break
    if(op > 3):
        print("Digite uma opção valída.\n")
