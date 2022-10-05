

vTotalVista = 0
vTotalPrazo = 0
vTotal = 0
v1Prestacao = 0

for i in range(0,15):
    codigo = input("Escreve o codigo: ")
    valor = float(input("Escreve o valor: "))

    if codigo == "V":
        vTotalVista = vTotalVista + valor
        vTotal = vTotal + valor
    elif codigo == "P":
        vTotalPrazo = vTotalPrazo + valor
        vTotal = vTotal + valor
        p1 = valor / 3
        v1Prestacao = p1 + v1Prestacao

print("Valor total transacao vista: ",vTotalVista)
print("Valor total trasacao a prazo: ",vTotalPrazo)
print("Valor total da transacoes: ",vTotal)
print("Valores total primeiras parcelas: ",v1Prestacao)