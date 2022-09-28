#Crie uma calculadora capaz de somar, subtrarir, multiplicar e dividir 2 números. 
#O usuário deve informar a operação desejada e os valores a serem calculados

print("Escolha uma das operações a baixo (1, 2, 3 ou 4)")
print("1 - Adição")
print("2 - Subtração")
print("3 - Multiplicação")
print("4 - Divisão")
op = int(input("Digite a sua opção: "))

if(op > 4 or op < 1):
    print("Digite um valor de operação válido")
else:
    num1 = float(input("Digite o valor do primeiro numero: "))
    num2 = float(input("Digite o valor do segundo numero: "))
    if(op == 1):
        valFinal = num1 + num2
    elif(op == 2):
        valFinal = num1 - num2
    elif(op == 3):
        valFinal = num1 * num2
    else:
        valFinal = num1 / num2

print("Valor final:",valFinal)
