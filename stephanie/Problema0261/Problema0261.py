modelos = []
consumo = []
maisEconomico=1000
i = 0
while i<5:
    modelos[i] = input("Digite o modelo do carro ",i,": ")
    i = i+1
    
i = 0
while i<5:
    consumo[i] = ("Digite o consumo do carro ",i,": ")
    i = i+1

i = 0
while i<5:
    if(consumo[i]<maisEconomico):
        modeloEconomico = modelos[i]
    i = i+1

print("Modelo mais econômico:",modeloEconomico)

print("Quantos litros de combustível cada um dos carros cadastrados ", 
"consome para percorrer uma distância de 1.000 km:")
i = 0
while i<5:
    litrosCombustivel = consumo[i]*1000
    print(modelos[i],":",litrosCombustivel)
    i = i+1
