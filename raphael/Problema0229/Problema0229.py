# Uma empresa de vendas possui quinze vendedores viajantes e, ao final do mês, deseja fazer uma análise de suas vendas. Para tanto, para cada vendedor a empresa tem as seguintes informações: tempo de serviço (em anos), valor de suas vendas, total de despesas com viagem. O tempo de serviço é especificado por um código, conforme a seguir.•Acima de 10 anos (A)  •Entre 5 e 10 anos (inclusive extremos)(B)  • Menos que 5 anos (C). Crie um algoritmo que leia os dados e forneça:  a ) A faixa de tempo de serviço que apresenta maior despesa com viagem ; b ) A média de vendas dos vendedores que possuem menos de cinco anos de serviço ; c ) A diferença entre o valor das vendas e despesas com viagem dos vendedores que tem mais de dez anos de serviço ; d ) O total de despesas com viagem pagos pela empresa.

faixa='0'
maiorDespesa=0
somador=0
diferenca=0
totalDespesas=0
contador=0

for x in range(15):

    print("\nPara o {}º vendedor \n \n Digite o tempo de serviço conforme: \n \n * Acima de 10 anos (A) \n * Entre 5 e 10 anos (B) \n * Menos que 5 anos (C)".format(x+1))
    tempoServ = (input(": "))

    vendas = float(input("Digite o valor de suas vendas: "))

    despesas = float(input("Digite o total de despesas com a viagem: "))

    totalDespesas = totalDespesas + despesas

    if despesas > maiorDespesa:
        maiorDespesa = despesas
        faixa = tempoServ

    if tempoServ == 'C':
        somador = somador + vendas
        contador = contador + 1

    if tempoServ == 'A':
        diferenca = diferenca + (vendas - despesas)

media = somador / contador

print("\n A faixa de tempo de serviço que apresenta maior despesa com viagem: {}\n\nA media de vendas dos vendedores que tem menos que 5 anos de serviço é: {}\n\nA diferença entre o valor das vendas e despesas com viagem dos vendedores que tem mais de dez anos de serviço é: {}\n\nO total de despesas com viagem pagos pela empresa é: {}".format(faixa, media, diferenca, totalDespesas))