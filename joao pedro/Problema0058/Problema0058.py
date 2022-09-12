valor = float(input("Digite o valor da compra: "))
compra = float(input("Digite o quanto sera pago na compra: "))
troco = compra-valor
print("Troco: ", troco)
print("Valor da compra: ", valor)

x = troco//100
print("Notas de 100: ", x)

troco = troco-(100*x)

y = (troco-x)//10

print("Notas de 10:", y)

troco = troco-(10*y)
z = (troco-(y*10)) // 1
print("Notas de 1: ", z)
