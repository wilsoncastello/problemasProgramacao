qtdSaco = input("Digite quantos quilos tem no saco de ração:")
gato1gr = input("Digite quantas gramas de ração o gato 1 come por dia:")
gato2gr = input("Digite quantas gramas de ração o gato 2 come por dia:")

gato1kg = float(gato1gr)/1000
gato2kg = float(gato2gr)/1000
sobra = float(qtdSaco) - (float(gato1kg) * 5 + float(gato2kg) * 5)
print("Após 5 dias terá ",sobra,"kg no saco de ração.")