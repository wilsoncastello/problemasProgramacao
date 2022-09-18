preco = float(input("Digite o preco do produto: "))
tipo = (input("Digite o tipo de produto(A - alimentacao; L - limpeza; e V - vestuario): "))

if tipo == "A":
            if preco <= 25:
                aumento = preco * 1.08
            else:
                aumento = preco * 1.15
elif tipo=="L":
            if preco <= 25 :
                aumento = preco * 1.05
            else :
                aumento = preco * 1.12
elif tipo=="V":
            if preco <= 25 :
                aumento = preco * 1.1
            else :
                aumento = preco * 1.18
refrigerado=(input("Classifique o produto (S - produto que necessita de refrigeracao; e N - produto que nao necessita de refrigeracao):"))
       
if refrigerado=="S":
            if aumento <= 50 :
                print("Novo preco: " ,aumento, ". Classificacao: Barato")
            else :
                if aumento > 50 and aumento < 120 :
                    print("Novo preco: " ,aumento, ". Classificacao: Normal")
                else :
                    print("Novo preco: " ,aumento, ". Classificacao: Caro")
elif refrigerado=="N":
            aumento = aumento * 0.97
            if aumento <= 50 :
                print("Novo preco: " ,aumento, ". Classificacao: Barato")
            else :
                if aumento > 50 and aumento < 120 :
                    print("Novo preco: " ,aumento, ". Classificacao: Normal")
                else :
                    print("Novo preco: " ,aumento, ". Classificacao: Caro")


