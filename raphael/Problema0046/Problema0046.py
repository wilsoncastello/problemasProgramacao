#Faça um programa que leia um número no formato CDU e imprima-o invertido: UDC. (Exemplo: 123, sairá 321.) O numero deverá ser armazenado em outra váriavel antes de ser impresso.

cdu = int(input("Digite um numero com 3 casas decimais: "))

temp = cdu % 10
udc = temp * 100
temp2 = (cdu % 100) - temp
udc = udc + temp2
temp3 = cdu / 100
udc = udc + temp3

print("")
print(int(udc))