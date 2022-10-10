limiteInferior = int(input("Digite o limite inferior:"))
limiteSuperior = int(input("Digite o limite superior:"))
decremento = int(input("Digite o valor do decremento:"))
grausCelsius = limiteSuperior
for i in range (limiteSuperior, limiteInferior, decremento * -1):
    grausFahrenheit = (grausCelsius * 9 / 5) + 32
    print("Graus Celsius: ",grausCelsius,"             Graus Fahrenheit: ",grausFahrenheit) 
    grausCelsius = grausCelsius - decremento
