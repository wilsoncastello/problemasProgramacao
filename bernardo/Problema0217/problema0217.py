# Entrada de valores e verificação do peso dos bois
registrado = False

numero = int(input("Digite o número de identificação do boi "
                   "(digite 0 ou menos para finalizar): "))
if numero > 0:
    registrado = True
    peso = float(input(f"Digite o peso do boi: "))
    maior_peso = peso
    boi_gordo = numero
    menor_peso = peso
    boi_magro = numero

while numero > 0:
    numero = int(input("Digite o número de identificação do boi "
                       "(digite 0 ou menos para finalizar): "))
    if numero > 0:
        peso = float(input(f"Digite o peso do boi: "))
        if peso >= maior_peso:
            maior_peso = peso
            boi_gordo = numero
        if peso <= menor_peso:
            menor_peso = peso
            boi_magro = numero

# Saída
if registrado:
    print(f"O boi {boi_gordo} é o mais gordo e seu peso é: "
    f"{maior_peso}")
    print(f"O boi {boi_magro} é o mais magro e seu peso é: "
    f"{menor_peso}")
else:
    print(f"Não houve registro de bois")
