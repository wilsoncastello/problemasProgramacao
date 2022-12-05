i = 0
a = []
b = []
while i<5:
    x = input("Digite o nome",i," do vetor A: ")
    a = a + x
    i = i + 1
i = 0
while i<10:
    x = input("Digite o nome",i," do vetor B: ")
    b = b + x
    i = i + 1
c = a + b 
print("Vetor C:",c)
