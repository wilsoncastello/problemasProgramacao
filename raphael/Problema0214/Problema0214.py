# "Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas no seu quadro de funcionários. Supondo que você seja o programador dessa empresa, crie um algoritmo que leia para cada candidato a idade, o sexo (M ou F) e a experiência no serviço (S ou N). 
    #Para encerrar a entrada de dados, digite zero para a idade. Calcule e escreva: 
    #- o número de candidatos do sexo feminino; 
    #- o número de candidatos do sexo masculino; 
    #- a idade média dos homens que já têm experiência no #serviço; 
    #- a porcentagem dos homens com mais de 45 anos entre o total dos homens; 
    #- o número de mulheres com idade inferior a 35 anos e com experiência no serviço; 
    #- a menor idade entre as mulheres que já têm experiência no serviço."

idade=1
contSexF = 0
contSexM = 0
mulherMenos35ComExp = 0
homemMais45 = 0
menorIdadeFComExp = 100
cont1 = 0
somadorIdade = 0
porc = 0
somadorIdade = 0
homemMais45 = 0

while not idade == 0:

    idade = int(input("Digite a idade do candidato (Digite \"0\" para encerrar o programa): "))

    sexo = input("Digite o sexo do candidato (M ou F): ")

    exp = input("Digite se tem experiencia profissional (S ou N): ")

    if sexo == 'F':
        contSexF = contSexF + 1

        if idade < 35 and exp == 'S':
            mulherMenos35ComExp = mulherMenos35ComExp + 1

        if idade < menorIdadeFComExp:
            menorIdadeFComExp = idade
        
    else:
        if sexo == 'M':
            contSexM = contSexM + 1

            if exp == 'S':
                cont1 = cont1 + 1
                somadorIdade = somadorIdade + idade
            
            if idade > 45:
                homemMais45 = homemMais45 + 1

    if homemMais45 == 0:
        porc = 0
    else: 
        porc = (homemMais45 * 100) / contSexM

print("\n São candidatos do sexo feminino: {}\n \n São candidatos do sexo masculino: {} \n \n A porcentagem de homens com mais de 45 anos é: {}% \n \n Mulheres com idade inferior a 35 anos e com experiência de serviço: {} \n \n A mulher com menos idade, entre as que tem experiência tem: {} anos".format(contSexF, contSexM, porc, mulherMenos35ComExp, menorIdadeFComExp))