codigoEstado = int(input("Digite o Código do Estado do caminhão(1-5): "))
peso = float(input("Digite o peso da carga do caminhão em Toneladas: "))
codigoCarga = int(input("Digite o Código da Carga do caminhão(10-40): "))

pesoQuilos = peso * 1000

precoCarga = 0
if(codigoCarga >= 10 and codigoCarga <=20):
    precoCarga = 100 * pesoQuilos
elif(codigoCarga >= 21 and codigoCarga <= 30):
    precoCarga = 250 * pesoQuilos
elif(codigoCarga >= 31 and codigoCarga <= 40):
    precoCarga = 340 * pesoQuilos

imposto = 0
if(codigoEstado == 1):
    imposto = precoCarga * 35 / 100
elif(codigoEstado == 2):
    imposto = precoCarga * 25 / 100
elif(codigoEstado == 3):
    imposto = precoCarga * 15 / 100
elif(codigoEstado == 4):
    imposto = precoCarga * 5 / 100
elif(codigoEstado == 5):
    imposto = 0

total = precoCarga + imposto

print("Peso da carga do caminhão em Quilos: ",pesoQuilos)
print("Preço da carga do caminhão: ",precoCarga)
print("Valor do imposto: ",imposto)
print("Valor total: ",total)