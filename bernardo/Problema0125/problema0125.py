# Entrada de valores
cidade = input("Digite a cidade: ")
aptos = float(input("Digite o número de votos aptos: "))
votos = int(input("Digite o número de pessoas que votaram: "))
candidato = float(input("Digite o número de votos do candidato mais votado: "))


# Verificação de segundo turno e saída
print(f"Na cidade de {cidade}")
if aptos > 200000 and candidato <= votos * 0.5:
        print("Terá segundo turno")
else:
    print("Não terá segundo turno")


