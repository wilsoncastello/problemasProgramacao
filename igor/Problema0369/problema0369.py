
w, h = 5, 5
x = [[0 for i in range(w)] for j in range(h)] 

for i in range(0,w):
    for j in range(0,h):
        x[i][j] = int(input(": "))


m = 0

for i in range(0,w):
    for j in range(0,h):
        m = max(m, x[i][j])

f = [0]*(m+1)


for i in range(0,w):
    for j in range(0,h):
        f[x[i][j]] = f[x[i][j]]+1

for i in range(0,m+1):
    if f[i] > 1:
        print(i,": ",f[i])