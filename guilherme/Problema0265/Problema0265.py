a = list(range(20))
b = list(range(20))
j = 19
for i in a:
    print("Digite o numero ",i," do vetor A: ")
    a[i] = int(input())
print("Vetor A:")
for i in a:
    print(i)
for i in range(0, 20):
    x = a[i]
    a[i] = b[j]
    b[j] = x
    j -= 1 
print("Vetor B:")
for i in b:
    print(i)