txt = input("Digite alguma frase: ")

if("aluno" in txt or "escola" in txt):
    if("aluno" in txt and "escola" in txt):
        txt2 = txt.replace("aluno", "estudante")
        print("Nova Frase:",txt2.replace("escola", "universidade"))

    elif("aluno" in txt):
        txt2 = txt.replace("aluno", "estudante")
        print("Nova Frase:",txt2)

    else:
        txt2 = txt.replace("escola", "universidade")
        print("Nova Frase:",txt2)

else:
    print("Frase continua igual: ",txt)

