# Função de alteração da string
def altera_string(mensagem, tamanho, caractere):
    numero = 0
    lista = list(mensagem)
    for letra in range(tamanho):
        if lista[letra] == caractere:
            lista[letra] = '*'
            numero += 1
    mensagem = "".join(lista)
    print(f"Mensagem alterada: {mensagem}")
    return numero

# Entrada de valores
mensagem = str(input("Digite a mensagem: "))
tamanho = int(input("Digite o tamanho: "))
caractere = str(input("Digite o caractere que deseja ser alterado: "))

# Saída e chamada de função
numero = altera_string(mensagem, tamanho, caractere)
print(f"Número de caracteres alterados: {numero}")
