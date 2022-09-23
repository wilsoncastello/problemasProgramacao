#Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer 
#pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a 
#tabela a seguir. Crie um algoritmo que entre com o nome e a idade de uma pessoa e imprima o nome e o
#valor que ela deverá pagar.
#* ate l0 anos -R$ 30 00
#* acima de 10 até 29 anos - R$ 60,00
#* acima de 29 até 45 anos - R$ 120,00
#* acima de 45 até 59 anos - R$ 150,00
#* acima de 59 até 65 anos - R$ 250,00
#* maior que 65 anos - R$ 400,00

#Entrada de dados
nome = input("Digite seu nome: ")
idade = int(input("Digite a sua idade :"))

#Processamento e Saída de dados
if(idade <= 10):
    print("Valor da conta do",nome,"- R$ 30")
elif(idade <= 29):
    print("Valor da conta do",nome,"- R$ 60")
elif(idade <= 45):
    print("Valor da conta do",nome,"- R$ 120")
elif(idade <= 59):
    print("Valor da conta do",nome,"- R$ 150")
elif(idade <= 65):
    print("Valor da conta do",nome,"- R$ 250")
else:
    print("Valor da conta do",nome,"- R$ 400")