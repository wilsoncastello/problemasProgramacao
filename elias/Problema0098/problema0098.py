h = float(input("Digite sua altura:"))
genero = input("Digite seu gênero:")
if genero == 'M' or genero == 'm':
    pesoIdeal = 72.7 * h - 58
    print("O seu peso ideal é: ",pesoIdeal)
elif genero == 'F' or genero == 'f':
    pesoIdeal = 62.1 * h - 44.7
    print("O seu peso ideal é: ",pesoIdeal)
else:
    print("Gênero inválido, tente novamente!")