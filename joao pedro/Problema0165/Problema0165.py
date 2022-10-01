

altura1020=0
idade1020=0
pessoaMaior50=0
pesoInferior=0
for i in range(5):
    
    altura=float(input("Digite a altura da pessoa "))
    
    peso=float(input("Digite o peso da pessoa "))
    
    idade=int(input("Digite a idade da pessoa "))
    
    if idade>=10 and idade<=20:
        altura1020=altura+altura1020
        idade1020=idade1020+1
    if idade>50:
        pessoaMaior50=pessoaMaior50+1
    if peso<40:
        pesoInferior=pesoInferior+1
      

mediaAlturas=altura1020/idade1020
porcentagem=(pesoInferior*100)/5

print("A quantiade de pessoas com idade superior a 50 anos: ",pessoaMaior50)
print("A media das alturas das pessoas com idade entre 10 e 20 anos: ",mediaAlturas)
print("A porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analizadas: ",porcentagem)