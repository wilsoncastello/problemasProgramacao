"""
Uma companhia de teatro deseja montar uma série de espetáculos. A direção calcula que, a R$ 50,00 o ingresso, serão vendidos 120 ingressos, e que as despesas serão de R$ 2000,00. Diminuindo-se em R$ 5,00 o preço dos ingressos, espera-se que as vendas aumentem em 26 ingressos. Faça um programa que escreva uma tabela de valores de lucros esperados em função do preço do ingresso, fazendo-se variar esse preço de R$ 50,00 a R$ 10,00, de R$ 5,00 em R$ 5,00. Escreva, ainda, para  cada novo preço de ingresso, o seu valor e a quantidade de ingressos vendidos para a obtenção desse lucro.
"""


valorIngressos = int(50)
quantidadeVendas = int(120)
lucroFinal = int(valorIngressos * quantidadeVendas - 2000)

print("Lucros com o valor do ingresso sendo " + str(valorIngressos) + " e a quantidade de vendas sendo " + str(quantidadeVendas) + ":" + str(lucroFinal))
print(" ")

while(valorIngressos > 10):
        valorIngressos = valorIngressos - 5
        quantidadeVendas = quantidadeVendas + 26
        lucroFinal = valorIngressos * quantidadeVendas - 2000
        print("Lucros com o valor do ingresso sendo " + str(valorIngressos) + " e a quantidade de vendas sendo " + str(quantidadeVendas) + ":" + str(lucroFinal))
        print("")
        



