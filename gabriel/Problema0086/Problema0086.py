"""
Elabore um algoritmo que tome como entrada o número do mês (1 a 12) e o respectivo valor do ano e determine o número de dias desse mês. Veja que um mês apresenta 30 ou 31 dias, exceto o mês de fevereiro que tem 28 dias. Entretanto, fevereiro tem 29 dias caso o ano seja bissexto. Um ano é bissexto se for múltiplo de 4.
"""


mes = int(input("Digite o número do mês desejado: "))
ano = int(input("Digite o ano em questão: "))

if (mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12): 
    print("Esse mês tem 31 dias")
      
elif(mes == 2):
        if(ano % 4 == 0):
            print("Esse mês tem 29 dias")
        
        else:
            print("Esse mês tem 28 dias")

else: 
    print("Esse mes tem 30 dias")
        
    

