#Uma empresa decide aplicar descontos nos seus preços usando a tabela a seguir. 
#*Até R$ 29.99 - Sem desconto
#*De R$ 30.00 a R$ 49.99 - 10%
#*De R$ 50.00 a R$ 79.99 - 15%
#*De R$ 80.00 a R$ 100.00 - 20%
#*Acima de R$ 100.00 - 25%
#Faça um programa que receba o preço atual de um produto e seu código, 
#calcule e mostre o valor do desconto e o novo preço.

print("Digite as informações do produto")
precoP = float(input("Digite o preço do produto: "))
codigoP = int(input("Digite o codigo do produto: "))

if(precoP <= 29.99):
    print("Informações do produto")
    print("Código do produto:",codigoP)
    print("Valor do desconto: 0%")
    print("Novo preço do produto:",precoP)

elif(precoP >= 30 and precoP <= 49.99):
    precoDesc = precoP - (10*precoP)/100

    print("Informações do produto")
    print("Código do produto:",codigoP)
    print("Valor do desconto: 10%")
    print("Novo preço do produto: ",precoDesc)

elif(precoP >= 50 and precoP <= 79.99):
    precoDesc = precoP - (15*precoP)/100

    print("Informações do produto")
    print("Código do produto:",codigoP)
    print("Valor do desconto: 15%")
    print("Novo preço do produto:",precoDesc )

elif(precoP >= 80 and precoP <= 100):
    precoDesc = precoP - (20*precoP)/100

    print("Informações do produto")
    print("Código do produto:",codigoP)
    print("Valor do desconto: 20%")
    print("Novo preço do produto:",precoDesc)

else:
    precoDesc = precoP - (25*precoP)/100

    print("Informações do produto")
    print("Código do produto:",codigoP)
    print("Valor do desconto: 25%")
    print("Novo preço do produto:",precoDesc)