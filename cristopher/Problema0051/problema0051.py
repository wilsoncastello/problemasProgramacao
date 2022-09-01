tempoGastoHoras = float(input("Digite o tempo gasto na viagem (em horas): "))

velocidadeMedia = float(input("Informe a velocidade média na viagem (em km): "))

distanciaPercorrida = tempoGastoHoras * velocidadeMedia

qtdLitros = distanciaPercorrida / 12

print(f"A distância percorrida no total foi de {distanciaPercorrida} Km.")
print(f"A quantidade de litros gastos na viagem foi de {qtdLitros} L.")