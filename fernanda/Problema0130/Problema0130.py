print("Tipos de carros: A, B e C.")
distancia = +float (input("Digite a distância de um percurso em Km: "))

tipoCarro = str (input("Digite o tipo de carro: "))

if (tipoCarro == ("A")) :
    print("O consumo estimado de combustível é de ", (distancia/12))
elif (tipoCarro == ("B")) :
    print("O consumo estimado de combustível é de ", (distancia/9))
elif(tipoCarro == ("C")) :
    print("O consumo estimado de combustível é de ", (distancia/8))     
