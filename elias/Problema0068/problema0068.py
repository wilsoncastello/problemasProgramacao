quantidadePrestacoes = int(input("Digite a quantidade total de prestações: "))
quantidadePrestacoesPagas = int(input("Digite a quantidade de prestações já pagas: "))
valorPrestacao = float(input("Digite o valor da prestação atual: "))
valorPago = quantidadePrestacoesPagas * valorPrestacao
saldoDevedor = (quantidadePrestacoes * valorPrestacao) - valorPago
print(f"O total pago pelo consorciado até agora é: {valorPago}")
print(f"O saldo devedor é: {saldoDevedor}")