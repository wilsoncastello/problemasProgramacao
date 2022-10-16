from ast import For


lim = int(input("Digite o limite superior maior que 0: "))
incr = int(input("Digite o incremento, maior que 0: "))

for i in range(0,lim,incr):
    print(i)