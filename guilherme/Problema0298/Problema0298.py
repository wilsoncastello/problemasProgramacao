vetor = list(range(10))
x = 1
maior = 0
print("Digite uma sequência de 10 números")
for i in range(10):
    vetor[i] = int(input())
    if(i == 0 or (i > 0 and vetor[i] < vetor[i-1])):
        x = 1
    elif(i > 0 and vetor[i] > vetor[i-1]):
        x += 1
    if(x > maior):
        maior = x
print("Maior Sequência:",maior)