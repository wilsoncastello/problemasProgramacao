
n = int(input("Digite um numero inteiro e positivo: "))
primo = bool(True)

for i in range(2, n):
  if (n % i == 0):
    primo = False

if (n < 0):
  primo = False

if (primo == True):
  print("O numero " + str(n) + " é primo")

else:
  print("O numero " + str(n) + " não é primo")