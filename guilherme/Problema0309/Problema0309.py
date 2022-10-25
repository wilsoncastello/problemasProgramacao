x = 0
y = 0
j = 0
k = 0
a = list(range(6))
b = list(range(6))
print("Digite 6 números para A: ")
for i in range(6):
    a[i] = int(input())
    if(a[i] % 2 == 1):
        x += 1
    else:
        y += 1
print("Digite 6 números para B: ")
for i in range(6):
    b[i] = int(input())
    if(b[i] % 2 == 1):
        x += 1
    else:
        y += 1
c = list(range(x))
d = list(range(y))
for i in range(6):
    if(a[i] % 2 == 1):
        c[j] = a[i]
        j += 1
    else:
        d[k] = a[i]
        k += 1
for i in range(6):
    if(b[i] % 2 == 1):
        c[j] = b[i]
        j += 1
    else:
        d[k] = b[i]
        k += 1
print("Vetor C: ")
for i in range(x):
    print(c[i])
print("Vetor D: ")
for i in range(y):
    print(d[i])
