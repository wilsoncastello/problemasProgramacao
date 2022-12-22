nomes = []
salario = []
tempo = []
for i in range (5):
    n = str(input("Digite o nome do funcionário %d :  " %i))
    nomes.append(n)
for i in range (5):
    n = float(input("Digite o salário de %s :  " %nomes[i]))
    salario.append(n)
for i in range (5):
    n = int(input("Digite o tempo de serviço de %s (Em anos): " %nomes[i]))
    tempo.append(n)
print("Funcionários que não tem direito ao aumento: ")
for i in range (5):
    if tempo[i] < 5 and salario[i] > 800 :
        print(nomes[i])
print("Funcionários que tem direito ao aumento: ")
for i in range (5):        
    if tempo[i] > 5 and salario[i] < 800 :
        salario[i] = salario[i] + salario[i] * 0.35
        print(nomes[i]," Novo salário: ",salario[i])
    elif tempo[i] > 5 and salario[i] > 800 :
        salario[i] = salario[i] + salario[i] * 0.25
        print(nomes[i]," Novo salário: ",salario[i])
    elif salario[i] < 800 and tempo[i] < 5 :
        salario[i] = salario[i] + salario[i] * 0.15
        print(nomes[i]," Novo salário: ",salario[i])
