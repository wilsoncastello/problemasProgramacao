def binario(n):
    dec = 0
    j = len(n) - 1
    for i in range(len(n)):
        if(n[i] == '1'):
            dec += 2**j
        j -=1
    return dec

bin = input("Digite um número em binário: ")
print(binario(bin))