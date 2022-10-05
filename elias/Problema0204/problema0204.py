pessoas = 0
while pessoas < 10:
    pessoas += 1
    nome = input("Digite seu nome:")
    salarioBruto = float(input("Digite seu salário bruto:"))
    if salarioBruto < 600:
        print(nome," você é isento da alíquota do imposto de renda")
    elif salarioBruto >= 600 and salarioBruto < 1500:
        valorAliquota = salarioBruto * 0.1
        print(nome," o valor da alíquota do seu imposto de renda é:",valorAliquota)
    else :
        valorAliquota = salarioBruto * 0.15
        print(nome," o valor da alíquota do seu imposto de renda é:",valorAliquota) 