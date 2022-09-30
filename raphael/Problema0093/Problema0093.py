# Considerando as faixas especificadas a seguir, escreva um algoritmo que, para um determinado valor inteiro, imprima qual a faixa que o mesmo pertence. Faixa A - Valores abaixo de 100; Faixa B - Valores de 100 a 150 (inclusive extremos); Faixa C - Valores de 151 a 300 (inclusive extremos); Faixa X - Quaisquer outros valores.

valor = int(input("Digite o valor inteiro: "))

if (valor < 100) :
    print("O valor pertence a Faixa A")

elif (valor > 99 and valor < 151) :
    print("O valor pertence a Faixa B")

elif (valor > 150 and valor < 301) :
    print("O valor pertence a Faixa C")

else:
    print("O valor pertence a Faixa X")