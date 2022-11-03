#Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor.
#Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram 
#(mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro...). Desconsidere empates.

k = 0
j = 0
tempMenor = 0
tempMaior = 0
tempM = list()
mes = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]

for i in range(0,12):

    temp = float(input(f"Digite a temperatura media do mês {i + 1}: "))
    tempM.append(temp)

    if(i == 0):
        tempMaior = tempMenor = tempM[i]
    
    elif(tempM[i] > tempMaior):
        tempMaior = tempM[i]
        k = i

    elif(tempM[i] < tempMenor):
        tempMenor = tempM[i]
        j = i

print(f"A maior temperatura registrada foi do mês de {mes[k]}, com {tempMaior} graus")
print(f"A menor temperatura registrada foi do mês de {mes[j]}, com {tempMenor} graus")