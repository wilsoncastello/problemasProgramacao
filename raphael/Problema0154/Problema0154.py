# Uma agência bancária possui dois tipos de investimentos, conforme o quadro a seguir. Faça um programa que receba o tipo de investimento e seu valor, calcule e mostre o valor corrigido após um mês de investimento, de acordo com o tipo de investimento.

tipo = int(input("Escolha sua opção de investimento e o valor conforme a tabela a seguir: \n \n TIPO        DESCRIÇÃO             RENDIMENTO \n  1          Poupança                  3% \n  2          Fundos de renda fixa      4% \n tipo: "))
valor = int(input("valor: "))

if (tipo == 1):
    valorCorrigido = valor + ((valor / 100) * 3)
elif (tipo == 2):
    valorCorrigido = valor + ((valor / 100) * 4)

print("O valor corrigido após um mês de aplicação é {}".format(valorCorrigido))