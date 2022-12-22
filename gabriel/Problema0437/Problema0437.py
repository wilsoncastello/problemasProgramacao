def calcularVenda(produtoA, produtoB):
      
    if(produtoA > 0  and produtoB > 0):
          precoFinal = (produtoA * 10 + produtoB * 20) * 0.85
        
    else:
        precoFinal = (produtoA * 10 + produtoB * 20) * 0.9
        
    return precoFinal
    
   
a = int(input("Digite a quantidade comprada do produto A: "))

b = int(input("Digite a quantidade comprada do produto B: "))

precoFinal = calcularVenda(a, b)
print("Preço final da compra: "+str(precoFinal))