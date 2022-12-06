# Entrada de valores
cotacao = float(input("Digite a cotação do dólar: "))
dolares = float(input("Digite a quantidade de dólares: "))

# Conversão para reais
reais = dolares * cotacao

# Saída
print(f"O valor convertido em reais é R${round(reais,2)}")
