saldoMedio = float(input("Digite seu saldo médio do último ano:"))
if saldoMedio < 0:
    print("Valor inválido, tente novamente")
elif saldoMedio >= 0 and saldoMedio <= 500:
    print("O seu saldo médio é ",saldoMedio," e você não possui nenhum crédito.")
elif saldoMedio >= 501 and saldoMedio <= 1000:
    credito = saldoMedio * 30 / 100
    print("O seu saldo médio é ",saldoMedio," e você possui um crédito de: ",credito)
elif saldoMedio >= 1001 and saldoMedio <= 3000:
    credito = saldoMedio * 40 / 100
    print("O seu saldo médio é ",saldoMedio," e você possui um crédito de: ",credito)   
elif saldoMedio > 3000:
    credito = saldoMedio * 50 / 100
    print("O seu saldo médio é ",saldoMedio," e você possui um crédito de: ",credito)