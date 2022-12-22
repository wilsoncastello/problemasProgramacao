horasExtras = float(input("Digite o número de horas extras: "))
horasFaltadas = float(input("Número de horas faltadas: "))

h = horasExtras - 2/3 * horasFaltadas

if h > 2400:
    print("Gratificação de R$500,00")
elif h > 1800:
    print("Gratificação de R$400,00")
elif h > 1200:
    print("Gratificação de R$300,00")
elif h > 600:
    print("Gratificação de R$200,00")
else:
    print("Gratificação de R$100,00")