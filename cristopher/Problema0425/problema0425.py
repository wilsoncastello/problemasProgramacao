def calculaFatorial(x):
    fatorial = 1
    for i in range(1, x+1):
        fatorial = fatorial * i
    
    return fatorial

def combinacao(n, p):
    resultado = calculaFatorial(n) / (calculaFatorial(p) * calculaFatorial(n - p))
    
    return resultado

n = int(input("Digite o valor de 'n' para a combinação: "))
p = int(input("Digite o valor de 'p' para a combinação: "))

resultado = combinacao(n, p)
print(resultado)