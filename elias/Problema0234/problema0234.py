numeroSequencia = 8
elementoControle = 0
n = int(input("Digite um número inteiro:"))
print(numeroSequencia)
while numeroSequencia < n and elementoControle < n :
    numeroSequenciaSoma = numeroSequencia + 2
    print(numeroSequenciaSoma)
    numeroSequenciaMultiplicacao = numeroSequencia * 2
    print(numeroSequenciaMultiplicacao)
    numeroSequencia = numeroSequenciaMultiplicacao
    elementoControle = numeroSequencia * 2
