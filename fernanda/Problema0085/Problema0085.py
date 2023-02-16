nome = str (input("Digite o seu nome: "))
portugues = float(input("Digite a nota de Potuguês: "))
matematica = float(input("Digite a nota de Matemática: "))
conhecimentosGerais = float(input("Digite a nota de Conhecimentos Gerais: "))
print(" ")

print("Nome do Candidato:",nome)
print("Nota em Potuguês: ",portugues)
print("Nota em Matemática: ",matematica)
print("Nota em Conhecimentos Gerais: ",conhecimentosGerais)

media = (portugues + matematica + conhecimentosGerais)/3
print("Média: ",media)

if (media >= 7):
    print("Candidato Aprovado")
else:
    print("Candidato Não Aprovado")
