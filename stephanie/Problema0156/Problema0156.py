preco = input("Digite o preço do produto: ")
codigo = input("Digite o código de origem do produto: ")

if(int(codigo)==1):
    print("Procedência do produto: Sul")
elif(int(codigo)==2):
    print("Procedência do produto: Norte")
elif(int(codigo)==3):
    print("Procedência do produto: Leste")
elif(int(codigo)==4):
    print("Procedência do produto: Oeste")
elif(int(codigo)==5 or int(codigo)==6):
    print("Procedência do produto: Nordeste")
elif(int(codigo)==7 or int(codigo)==8 or int(codigo)==9):
    print("Procedência do produto: Sudeste")
elif(int(codigo)>=10 and int(codigo)<=20):
    print("Procedência do produto: Centro-Oeste")
elif(int(codigo)>=21 and int(codigo)<=30):
    print("Procedência do produto: Nordeste")
