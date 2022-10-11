sb = float(input("Digite o salário base: "))
idade = int(input("Digite a idade: "))
tempoServico = int(input("Digite os anos de seviço: "))
dependentes = int(input("Digite a quantidade de dependentes: "))

if idade>50:
    sf = sb + ((idade - 50) * (sb / 100 * 1))
    sf = sf + tempoServico * (sb / 100 * 2)
else:
    sf = sb + tempoServico * (sb / 100 * 2)

print("Salário final: ",sf)

if (dependentes <= 5) & (dependentes != 0):
    sf = (sb / 100 * 4)
    print(sf," para cada dependente.")
else:
    print("Não aplicável.")