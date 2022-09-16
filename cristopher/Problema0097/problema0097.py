from xmlrpc.client import boolean


a = float(input("Informe o primeiro valor: "))
b = float(input("Informe o segundo valor: "))
c = float(input("Informe o terceiro valor: "))

ehTriangulo = False

if a > 0 and b > 0 and c > 0:
    if(a < (b + c) and b < (a + c) and c < (a + b)):
        ehTriangulo = True
    else:
        print("Não é triângulo.")
else:
    print("Não é triângulo.")

if ehTriangulo == True and a == b and a == c:
    print("É um triângulo equilátero.")
elif ehTriangulo == True and a == b or b == c or a == c:
    print("É um triângulo isósceles.")
elif ehTriangulo == True and a != b and b != c and a != c:
    print("É um triângulo escaleno.")

        


   