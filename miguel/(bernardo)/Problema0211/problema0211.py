# Entrada de valores e contagem de ingressos
socio = 0
nao_socio = 0
for n in range(10):
    ingresso = str(input(
        f"Digite o tipo do {n+1} ingresso(socio ou nao-socio) ou digite fim para finalizar: "))
    if ingresso.lower() == "socio":
        socio += 1
    elif ingresso.lower() == "nao-socio":
        nao_socio += 1
    elif ingresso.lower() == "fim":
        break
    else:
        print(f"Entrada {ingresso} não é reconhecida")
        break

# Cálculos
percentual = 0
ingressos = socio + nao_socio
if ingressos > 0:
    percentual = (socio * 100) / ingressos
valor_socios = 50 * socio
valor_nao_socios = 100 * nao_socio
valor_total = valor_socios + valor_nao_socios

# Saída
print(f"A quantidade de ingressos para sócios é: {socio}")
print(f"A quantidade de ingressos para não_sócios é: {nao_socio}")
print(f"O percentual de ingressos para sócios é: {percentual} %")
print(f"O valor recebido de sócios é: R${round(valor_socios,2)}")
print(f"O valor recebido de não-sócios é: R${round(valor_nao_socios,2)}")
print(f"O valor total recebido é: R${round(valor_total,2)}")
