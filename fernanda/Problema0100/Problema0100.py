idade = int (input("Digte a idade do nadador: "))

if (idade > 60) :
    print("Categoria Senior")
elif (idade > 18) :
    print("Categoria Adulto")
elif (idade > 11) :
    print("Categoria Juvenil")
elif(idade > 5) :
    print("Categoria Infantil")
else :
    print("Sem Categoria")
