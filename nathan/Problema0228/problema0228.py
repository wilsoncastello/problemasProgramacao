contPessoa300Comida = 0
somaMedia300Comida = 0
somaAluguel = 0
percAlimentacao = 0
percVestimenta = 0

for i in range(3):
    print("Universitário ", (i+1))
    rendaFamilia = float(input("Digite a renda mensal da família: "))
    gastoAlimentacao = float(input("Gasto com alimentação: "))
    gastoVestimenta = float(input("Gasto com vestimenta: "))
    gastoAluguel = float(input("Gasto com aluguel: "))      

    if gastoAlimentacao > 300:
        contPessoa300Comida = contPessoa300Comida +1
        somaMedia300Comida = somaMedia300Comida + gastoAlimentacao
    
    somaAluguel = somaAluguel + gastoAluguel
    percAlimentacao = (gastoAlimentacao * 100) / rendaFamilia
    percVestimenta = (gastoVestimenta * 100)/ rendaFamilia

    print("\nAluno ", (i+1), ":")
    print("Proporção de gastos com alimentação em relação a renda ", percAlimentacao, "%")
    print("Proporção de gastos com vestimenta em relação a renda ", percVestimenta, "%")

print("Renda média familiar dos alunos que gastam acima de R$ 300,00 com alimentação: ", somaMedia300Comida / contPessoa300Comida)
print("Gasto médio com aluguel: ", somaAluguel / 3)

