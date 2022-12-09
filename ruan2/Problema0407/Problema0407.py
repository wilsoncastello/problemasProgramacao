
def calculo(num):
    fat = 1
    s = 0

    for i in range(1, (num + 1)):
        fat = fat * i
        s = s + 1/fat 
        if(i == 1):
            s = s + 1

    return s

num = int(input("Digite um numero inteiro: "))
numFim = calculo(num)

print("Número final: ",numFim)