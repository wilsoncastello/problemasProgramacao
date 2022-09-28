#Um hotel cobra R$130,00 a diária e mais uma taxa de serviços. 
#A taxa de serviços é de: 
#R$8,50 por diária, se o número de diárias for maior que 15; 
#R$10,00 por diária, se o número de diárias for igual a 15; 
#R$12,00 por diária, se o número de diárias for menor que 15. 
#Construa um algoritmo que mostre o nome e a conta de um cliente.

#Entrada de dados
print("Olá, digite suas informações!")
nome = input("Seu nome: ")
numDias = int(input("Quantidade de dias hospedado: "))

#Processamento 
if(numDias > 15):
    diariaTotal = (numDias * 130) + (numDias * 8.5)

elif(numDias == 15):
    diariaTotal = (numDias * 130) + (numDias * 10)

else:
    diariaTotal = (numDias * 130) + (numDias * 12)

#Saída de dados
print("Informações do hospede")
print("nome:",nome)
print("Conta:",diariaTotal)