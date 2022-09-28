peso = input("Digite um peso na Terra: ")

print("1 - Mercúrio")
print("2 - Vênus")
print("3 - Marte")
print("4 - Júpiter")
print("5 - Saturno")
print("6 - Urano")
print("7 - Netuno")
n = input("Digite o número de um planeta: ")

if int(n)<=0:
    print("Entrada Inválida!")
elif int(n)==1:
    print("Peso em Mercúrio: ",float(peso)*0.37)
elif int(n)==2:
    print("Peso em Vênus: ",float(peso)*0.88)
elif int(n)==3:
    print("Peso em Marte: ",float(peso)*0.38)
elif int(n)==4:
    print("Peso em Júpiter: ",float(peso)*2.64)
elif int(n)==5:
    print("Peso em Saturno: ",float(peso)*1.15)
elif int(n)==6:
    print("Peso em Urano: ",float(peso)*1.17)
elif int(n)==7:
    print("Peso em Netuno: ",float(peso)*1.18)
elif int(n)>7:
    print("Entrada Inválida!")
