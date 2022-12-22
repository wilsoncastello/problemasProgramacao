data = input("Digite uma data (DD/MM/AAAA)")

dia = ""
mes = ""
ano = ""


i = data.rindex("/") - 1
while (i > data.index("/")):
            mes = data[i] + mes
            i -= 1

i = data.index("/") - 1
while (i >= 0):
            dia = data[i] + dia
            i -= 1

i = len(data) - 1
while (i > data.rindex("/")):
            ano = data[i] + ano
            i -= 1

if ("01" in mes):
            print(dia + "/Janeiro/" + ano)
if ( "02" in mes ) :
            print(dia + "/Fevereiro/" + ano)
if ( "03" in mes ) :
            print(dia + "/Marco/" + ano)
if ( "04" in mes ) :
            print(dia + "/Abril/" + ano)
if ( "05" in mes ) :
            print(dia + "/Maio/" + ano)
if ( "06" in mes ) :
            print(dia + "/Junho/" + ano)
if ( "07" in mes ) :
            print(dia + "/Julho/" + ano)
if ( "08" in mes ) :
            print(dia + "/Agosto/" + ano)
if ( "09" in mes ) :
            print(dia + "/Setembro/" + ano)
if ( "10" in mes ) :
            print(dia + "/Outubro/" + ano)
if ( "11" in mes ) :
            print(dia + "/Novembro/" + ano)
if ( "12" in mes ) :
            print(dia + "/Dezembro/" + ano)
