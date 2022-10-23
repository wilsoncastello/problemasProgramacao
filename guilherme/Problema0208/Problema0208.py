sen = 0
sinal = 1
x = float(input("Digite um número em graus: "))
y = x * 3.141592 / 180
for i in range(1, 20, 2):
  fat = 1
  for j in range(1, i + 1):
    fat *= j
  sen += (y**i) / fat * (sinal)
  sinal = sinal * (-1)

print("O seno de", x, "é", sen)