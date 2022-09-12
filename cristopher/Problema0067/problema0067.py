nome = input("Informe o seu nome: ")

qtdPorcas = int(input("Informe a quantidade de porcas que você comprou: "))
precoPorca = float(input("Agora, digite o preço unitário da porca: R$ "))

qtdParafusos = int(input("Informe a quantidade de parafusos que você comprou: "))
precoParafuso = float(input("Agora, digite o preço unitário do parafuso: R$ "))

qtdArruelas = int(input("Informe a quantidade de arruelas que você comprou: "))
precoArruela = float(input("Agora, digite o preço unitário da da arruela: R$ "))

valorBruto = (precoPorca * qtdPorcas) + (precoParafuso * qtdParafusos) + (precoArruela * qtdArruelas)

descontoPorca = (precoPorca * qtdPorcas) * 10/100
descontoParafuso = (precoParafuso * qtdParafusos) * 20/100
descontoArruela = (precoArruela * qtdArruelas) * 30/100

valorDesconto = descontoPorca + descontoParafuso + descontoArruela

valorFinal = valorBruto - valorDesconto

print(f"{nome}, você comprou {qtdPorcas} porcas, {qtdParafusos} parafusos e {qtdArruelas} arruelas.")
print(f"O valor bruto é de R$ {valorBruto}")
print(f"O valor do desconto é de R$ {valorDesconto}")
print(f"O valor final é de R$ {valorFinal}")