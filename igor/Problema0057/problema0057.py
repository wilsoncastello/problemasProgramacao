quantidadeFitas = int(input("Quantidade de fitas: "))
valorAluguel = float(input("Valor aluguel: "))

faturamentoAnual = ((int(quantidadeFitas/3)) * valorAluguel)*12
print("Faturamento Anual: ",faturamentoAnual)

totalMultas = (quantidadeFitas/10) * (valorAluguel*(110/100))
print("Valor ganho por multa ao mes: ",totalMultas)

reposicao = quantidadeFitas * (10/100)
fitasEstragadas = quantidadeFitas * (2/100)
quantidadeFinal = quantidadeFitas - fitasEstragadas + reposicao
print("Quantidade de fitas final: ",quantidadeFinal)