print("DESTINO")
print("N - Norte")
print("NE - Nordeste")
print("CO - Centro-Oeste")
print("S - Sul")
destino = input("\nDigite o seu destino: ")
retorno = input("Viagem de ida e volta(True ou False): ")

if(destino == "n" and retorno == "false"):
    print("Valor: R$500,00")
elif(destino == "n" and retorno == "true"):
    print("Valor: R$900,00")
elif(destino == "ne" and retorno == "false"):
    print("Valor: R$350,00")
elif(destino == "ne" and retorno == "true"):
    print("Valor: R$650,00")
elif(destino == "co" and retorno == "false"):
    print("Valor: R$350,00")
elif(destino == "co" and retorno == "true"):
    print("Valor: R$600,00")
elif(destino == "s" and retorno == "false"):
    print("Valor: R$300,00")
elif(destino == "s" and retorno == "true"):
    print("Valor: R$550,00")
else:
    print("Região Indisponível ou não existente")