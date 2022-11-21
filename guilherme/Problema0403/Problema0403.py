def acrescimo(x, y):
    z = y*100/x
    return z


print("Digite o valor antigo de um produto: ")
valorAntigo = float(input())
print("Digite o valor atual de um produto: ")
valorAtual = float(input())

acrescimo = acrescimo(valorAntigo, valorAtual)
print("O percentual de acréscimo: {}%".format(acrescimo))