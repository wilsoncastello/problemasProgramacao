"""
Elabore uma sub-rotina que receba dois números como parâmetros e retorne 0, 
se o primeiro número for divisivel pelo segundo número. 
Caso contrário, devera retornar o proximo divisor. 
Em seguida, crie um programa que leia os dados necessários, 
chame a função e apresente o valor retornado por ela
"""
def calculo(n1, n2):
    if(n1 % n2 == 0):
        s = 0

    else:
        if(n1 > n2):
            while(n1 % n2 != 0):
                n2 = n2 + 1
                s = n2

        else:
            while(n1 % n2 != 0):
                n2 = n2 - 1
                s = n2

    return s

n1 = float(print("Digite o dividendo: "))
n2 = float(print("Digite o divisor: "))

valRetorno = calculo(n1, n2)

print()
print("Se o primeiro número for divisivel pelo segundo número, caso contrário irá retornar o proximo divisor daquela divisão")
print("Valor retornado: ",valRetorno)


