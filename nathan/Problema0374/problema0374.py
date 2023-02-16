vDiaria = []
totalVendasDia = [0,0,0,0,0,0]
somaVendedor = 0
somaTotal = 0

for l in range(5):
    linhavDiaria = []
    somaVendedor = 0
    print(f"\nDados do vendedor {l+1}:")
    for c in range(6):
        x = int(input(f"Venda do {c+1}° dia: "))
        linhavDiaria.append(x)
        somaVendedor = somaVendedor + x
        somaTotal = somaTotal + x
    vDiaria.append(linhavDiaria)
    print(f"\nTotal Vendas da semana vendedor {l+1} é: {somaVendedor}")
print("\nVendas dos dias de todos os vendedores somados")

#Problema aqui
x = 0
for i in range(5):
    for j in range(6):
        totalVendasDia[j] = totalVendasDia[j] + vDiaria[i][j]
    #totalVendasDia[j].append(x)
    #x = 0

for i in range(6):
    print(f"Vendas do {i+1} dia: {totalVendasDia[i]}")
    
print(f"\nSoma total das vendas: {somaTotal}")



