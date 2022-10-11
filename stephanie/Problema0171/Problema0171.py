contSim = 0
contNao = 0
contSimFem = 0
contNaoMas = 0
contMas = 0
i = 0
while (i<10):
    sexo = input("Digite o sexo do entrevistado(M/F):")
    resposta = input("Digite a resposta do entrevistado(S/N):")
    if(resposta == "N" or resposta == "n"):
            contNao = contNao+1
            if(sexo == "M" or sexo == "m"):
                contNaoMas = contNaoMas+1
    elif(resposta == "S" or resposta == "s"):
        contSim = contSim+1
        if(sexo == "F" or sexo == "f"):
                contSimFem = contSimFem+1
    if(sexo == "M" or sexo == "m"):
        contMas = contMas+1
    i=i+1

porcentagem = (contNaoMas*contMas)
print("O número de pessoas que responderam sim: ",contSim)
print("O número de pessoas que responderam não: ",contNao)
print("O número de mulherem que responderam sim: ",contSimFem)
print("A porcentagem de homens que responderam não, entre todos os homens analisados: ",porcentagem,"%")
