nome = input("Digite o nome do livro: ")
escolha = int(input("Tipo de usuário: \n\t1 - Professor\n\t2 - Aluno\nDigite: "))

if escolha == 1:
    print("Recibo :\n\t",nome , "\n\tTipo de usuário: Professor \n\tPrazo: 10 dias.")
elif escolha == 2:
    print("Recibo :\n\t",nome , "\n\tTipo de usuário: Aluno \n\tPrazo: 3 dias.")
else:
    print("Escolha inválida.")
