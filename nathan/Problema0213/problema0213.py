salMin = float(input("Digite o valor do salário minímo: "))

valorHoraTrabalhada = float(salMin / 10)
valorHoraExtra = float(valorHoraTrabalhada / 2)

numHoras = float(input("Numero de horas trabalhadas: "))

while numHoras != -1:
    numDependentes = int(input("Número de dependentes: "))
    quantHorasExtras = float(input("Quantidade de horas extras trabalhadas: "))

    salarioMes = numHoras * valorHoraTrabalhada
    salarioBruto = salarioMes + (valorHoraExtra * quantHorasExtras) + (300 * numDependentes)

    if salarioBruto <= 1800 :
        salarioLiquido = salarioBruto
    elif salarioBruto <= 5000:
        salarioLiquido = salarioBruto - (salarioBruto * 0.1)
    else:
        salarioLiquido = salarioBruto - (salarioBruto * 0.2); 

    if salarioLiquido <= 2500 :
        salarioFinal = salarioLiquido + 300
    else:
        salarioFinal = salarioLiquido + 100 
    
    print("Salario Final do funcionário: ", salarioFinal)

    numHoras = float(input("Numero de horas trabalhadas: "))

print("Programa finalizado")
    
