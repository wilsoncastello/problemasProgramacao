rendimento = input("Digite o rendimento familiar:")
criancas = input("Digite quantas crianças menores tem na família:")
totalRen = rendimento
totalCri = criancas
familias = 1
if(rendimento<=1000):
    renMenor1000 =1 
while (rendimento>0):
    rendimento = input("Digite o rendimento familiar:")
    criancas = input("Digite quantas crianças menores tem na família:")
    totalRen += rendimento
    totalCri += criancas
    familias += 1
    if(rendimento<=1000):
        renMenor1000 += 1 
mediaRen = totalRen/familias
mediaCria = totalCri/familias
print("Média dos rendimentos da população:",mediaRen)
print("Média do número de filhos:",mediaCria)
print("Percentual de famílias com rendimento igual ou inferior a R$1000:",renMenor1000,"%")