h = int(input("Digite a hora:"))
m = int(input("Digite o minuto:"))
s = int(input("Digite o segundo:"))

s = s + 1

if(s >= 60):
    s = 0
    m = m + 1

if(m >= 60):
    m = 0
    h = h + 1

if(h >= 24):
    h = 0

print(h,"h",m,"m",s,"s")