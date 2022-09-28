#Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua 
#opinião em relação ao filme:ótimo - 3 ; bom - 2 ; regular - 1. Faça um programa que receba 
#a idade e a opinião de quinze espectadores, calcule mostre:
#*A média das idades das pessoas que responderam ótimo; 
#*A quantidade de pessoas que responderam regular; 
#*A porcentagem de pessoas que responderam bom, entre todos os espectadores analisados.

contPessoaOtimo = 0
contPessoaRegular = 0
contPessoaBom = 0
somaIdade = 0

for i in range(0,15):
    idade = int(input("Digite a sua idade: "))
    print("Qual a sua opnião do filme (ótimo - 3 ; bom - 2 ; regular - 1)?")
    opFilme = int(input("Digite: "))
    print("")
    if(opFilme == 3):
        contPessoaOtimo = contPessoaOtimo + 1
        somaIdade = somaIdade + idade
        if(contPessoaOtimo > 0):
            mediaIdade = somaIdade/contPessoaOtimo
    elif(opFilme == 1):
        contPessoaRegular = contPessoaRegular + 1
    else:
        contPessoaBom = contPessoaBom + 1

porcentagemBom = (contPessoaBom * 100)/15

print("A média das idades das pessoas que responderam ótimo:",mediaIdade)
print("A quantidade de pessoas que responderam regular:",contPessoaRegular)
print("A porcentagem de pessoas que responderam bom:",porcentagemBom,"%")