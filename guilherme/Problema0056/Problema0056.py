p = float(input("Digite o valor constante da aplicação mensal: "))
i = float(input("Digite o valor da taxa: "))
n = int(input("Digite o número de meses: "))
valorAcumulado = (p * ((1 + i) ** n) - 1) / i
print("O rendimento será de: ", valorAcumulado)