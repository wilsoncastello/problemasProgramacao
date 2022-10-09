base8 = input("Escreve numero base 8: ")

while base8 != "*":
    print("Base 8: ",base8)
    base8 = str(int(base8,8))

    base10 = int(base8, 10)
    print("Base 10: ",base10)

    base8 = input("Escreve numero base 8: ")