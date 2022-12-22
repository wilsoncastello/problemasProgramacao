salario = float(input("Digite o salário minímo: "))
horasTrabalho = float(input("Digite as horas trabalhadas: "))
dependentes = float(input("Digite a quantidade de dependentes: "))
horasExtraTrabalhada = float(input("Digite as horas extras : "))

hora = salario / 5
        
salarioMes = horasTrabalho * hora
        
depSalario = dependentes * 200

horasExtra = horasExtraTrabalhada * (hora + hora * 50 / 100)

salarioBruto = salarioMes + depSalario + horasExtra

if salarioBruto <= 2000:
    print("Isento de imposto.\n\tSalario bruto: ",salarioBruto)
elif salarioBruto <= 5000:
    imposto = salarioBruto * 15 / 100
else:
    imposto = salarioBruto * 27.5 / 100

salarioLiquido = salarioBruto - imposto

if salarioLiquido < 3000:
    salarioFinal = salarioLiquido + 1000
    print("Salário final: ",salarioFinal)
else:
    salarioFinal = salarioLiquido + 500
    print("Salário final: ",salarioFinal)
