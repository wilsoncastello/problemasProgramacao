numeroCanal = 1
somaCanal4 = 0
somaCanal5 = 0
somaCanal7 = 0
somaCanal12 = 0

while(numeroCanal != 0):
    numeroCanal = int(input("Digite o número do canal: "))
    if (numeroCanal == 4):
        qtdPessoasAssistindo4 = int(input("Informe o número de pessoas assistindo a esse canal: "))
        somaCanal4 = somaCanal4 + qtdPessoasAssistindo4
    elif (numeroCanal == 5):
        qtdPessoasAssistindo5 = int(input("Informe o número de pessoas assistindo a esse canal: "))
        somaCanal5 = somaCanal5 + qtdPessoasAssistindo5
    elif (numeroCanal == 7):
        qtdPessoasAssistindo7 = int(input("Informe o número de pessoas assistindo a esse canal: "))
        somaCanal7 = somaCanal7 + qtdPessoasAssistindo7
    elif (numeroCanal == 12):
        qtdPessoasAssistindo12 = int(input("Informe o número de pessoas assistindo a esse canal: "))
        somaCanal12 = somaCanal12 + qtdPessoasAssistindo12
    else:
        print("Número do canal inválido.")

quantidadeTotalEspectadores =  somaCanal4 + somaCanal5 + somaCanal7 + somaCanal12

percentualCanal4 = (somaCanal4 * 100) / quantidadeTotalEspectadores
percentualCanal5 = (somaCanal5 * 100) / quantidadeTotalEspectadores
percentualCanal7 = (somaCanal7 * 100) / quantidadeTotalEspectadores
percentualCanal12 = (somaCanal12 * 100) / quantidadeTotalEspectadores

print(f"Total de pessoas assistindo ao canal 4: {somaCanal4}")
print(f"Percentual de audiência do canal 4: {percentualCanal4} (%)")
print("\n")
print(f"Total de pessoas assistindo ao canal 5: {somaCanal5}")
print(f"Percentual de audiência do canal 5: {percentualCanal5} (%)")
print("\n")
print(f"Total de pessoas assistindo ao canal 7: {somaCanal7}")
print(f"Percentual de audiência do canal 7: {percentualCanal7} (%)")
print("\n")
print(f"Total de pessoas assistindo ao canal 12: {somaCanal12}")
print(f"Percentual de audiência do canal 12: {percentualCanal12} (%)")

