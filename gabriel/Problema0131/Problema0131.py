"""
"Crie um algoritmo que informe a quantidade total de calorias de uma refeição a partir da escolha do usuário 'que deverá informar o prato, a sobremesa e bebida
(veja a tabela a seguir).

PRATO                                 SOBREMESA                                     BEBIDA
Vegetariano 180cal                   Abacaxi 75cal                                Chá 20cal
Peixe 230cal                         Sorvete diet 11Ocal                          Suco de laranja 70cal
Frango 250cal                        Mousse diet 1 7Ocal                          Suco de melão 1 OOcal
Carne 350cal                         Mousse chocolate 200cal                      Refrigerante diet 65cal"

"""


prato = input("Digite o prato escolhido (Vegetariano, peixe, frango ou carne): ")
sobremesa = input("Digite a sobremesa escolhida (Abacaxi, sorvete diet, mousse diet ou mousse chocolate): ")
bebida = input("Digite a bebida escolhida (Chá, suco de laranja, suco de melão, refrigerante diet): ")



if(prato.lower() == "vegetariano"):
    caloriaPrato = 180

elif(prato.lower() == "peixe"):
    caloriaPrato = 230

elif(prato.lower() == "frango"): 
    caloriaPrato = 250

else: 
    caloriaPrato = 350



if(sobremesa.lower() == "abacaxi"):
    caloriaSobremesa = 75

elif(sobremesa.lower() == "sorvete diet"):
    caloriaSobremesa = 110

elif(sobremesa.lowe() == "mousse diet"):
    caloriaSobremesa = 170

else:
    caloriaSobremesa = 200



if(bebida.lower() == "refrigerante diet"):
    caloriaBebida = 65

elif(bebida.lower() == "suco de laranja"):
    caloriaBebida = 70

elif(bebida.lower() == "suco de melão"):
    caloriaBebida = 100

else:
    caloriaBebida = 20



totalCaloria = caloriaPrato + caloriaSobremesa + caloriaBebida

print("Total de calorias consumidas na refeição escolhida: "+ str(totalCaloria))
    



   