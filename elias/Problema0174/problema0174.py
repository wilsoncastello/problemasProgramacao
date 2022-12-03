somaSalarios = 0
mulheresAte2000 = 0
pessoas = 0
maioridade = 0
menorIdade = 200
menorSalario = 999999
idade = 0
idade = int(input("Digite sua idade: (Digite um valor negativo para sair do programa!):"))
while idade > 0:
    genero = input("Digite seu gênero (M = Masculino; F = Feminino):")
    salario = float(input("Digite seu salário:"))
    somaSalarios = somaSalarios + salario
    if idade > maioridade:
        maioridade = idade
    if idade < menorIdade:
        menorIdade = idade
    if genero == 'F' and salario <= 2000 or genero == 'f' and salario <= 2000:
        mulheresAte2000 = mulheresAte2000+1
    if salario < menorSalario:
        menorSalario = salario
        generoMenorSalario = genero
        idadeMenorSalario = idade
    pessoas = pessoas+1
    idade = int(input("Digite sua idade: (Digite um valor negativo para sair do programa!):"))
mediaSalarios = somaSalarios / pessoas
print("A média de todos os salário é: ",mediaSalarios)
print("A maior idade do grupo é ",maioridade," e a menor é ",menorIdade)
print("A quantiade de mulheres com salário até R$ 2000,00 é: ",mulheresAte2000)
print("A idade da pessoa que possui o menor salário é ",idadeMenorSalario," e ela é do gênero ",generoMenorSalario)