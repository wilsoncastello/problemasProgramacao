palavra="aula"
vezes=0


frase=input("Digite uma frase que sera detectado o numero de vezes que 'Aula' aparece: ")
frase1=frase.casefold()

print("Numero de vezes: ",frase1.count("aula"))
