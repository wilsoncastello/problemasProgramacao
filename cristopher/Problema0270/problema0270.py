
vetorPrimos = []

for i in range(100,150):
    primo = True

    for j in range(2, i):
        if(i % j == 0):
            primo = False
    
    if (primo):
        vetorPrimos.append(i)
        
    
for i in range(0,10):
    print(f"[{i}]: {vetorPrimos[i]}")

