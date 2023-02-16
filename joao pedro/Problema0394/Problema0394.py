gasto = [[0.0] * (2) for _ in range(24)]
maiorGasto = 0
ano = 0
mes = 0
consumo1 = 0
consumo2 = 0
medio1 = 0
medio2 = 0
x=0
i = 0
while (i < 2) :
    j = 0
    while (j < 12) :
        print("Digite o gasto do mes " ,j, " no ano " ,i, ": ")
        gasto[j][i]=float(input(""))
        
        if (gasto[j][i] > maiorGasto) :
            maiorGasto = gasto[j][i]
            ano = i
            mes = j
        if (i == 0) :
            consumo1 = gasto[j][i] + consumo1
        else :
            consumo2 = gasto[j][i] + consumo2
        j+=1
    i+=1
    

        
print("Consumo medio em 2020 (ano 0): " ,consumo1 / 12)
print("Consumo medio em 2022 (ano 1): " ,consumo2 / 12)
print("Maior gasto de energia (Mes/Ano): " ,mes, "/" ,ano)
print("Consumo em 2020 (ano 0): " ,consumo1)
print("Consumo em 2022 (ano 1): " ,consumo2)