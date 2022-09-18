dia = int(input("Digite o dia da data a ser inserida: "))
mes = int(input("Digite o mes da data a ser inserida: "))
ano = int(input("Digite o ano da data a ser inserida: "))

validarAno = False

if dia > 0 and dia <= 31:
    if mes > 0 and mes <= 12:
        if ano > 0:
            validarAno = True

print("Data inserida é valido? ", validarAno)
        
