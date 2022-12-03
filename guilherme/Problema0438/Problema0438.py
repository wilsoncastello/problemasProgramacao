def triangulo(a, b, c):
    x = 0
    if(a + b > c and a + c > b and b + c > a):
        if(a == b and b == c):
            x = 1
        elif(a == b and b != c or a == c and a != b or b == c and c != a):
            x = 2
        elif(a != b and a != c and b != c):
            x = 3
    return x

print("Digite o primeiro lado: ") 
a = int(input()) 
print("Digite o segundo lado: ") 
b = int(input()) 
print("Digite o terceiro lado: ") 
c = int(input()) 
if(triangulo(a, b, c) == 0):
    print("Não é um triângulo!") 
elif(triangulo(a, b, c) == 1):
    print("Triângulo Equilátero!") 
elif(triangulo(a, b, c) == 2):
    print("Triângulo Isóceles!") 
elif(triangulo(a, b, c) == 3):
    print("Triângulo Escaleno!") 