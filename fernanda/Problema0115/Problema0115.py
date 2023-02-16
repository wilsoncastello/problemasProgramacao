salarioBruto = float (input ("Digite o salário bruto: "))
valorPrestacao = float (input ("Digite o valor da prestação: "))

valorMaximo = ( salarioBruto*30 )/100

if (valorPrestacao > valorMaximo) :
    print("O empréstimo não pode ser concedido.")
else :
    print("O empréstimo pode ser concedido.")
