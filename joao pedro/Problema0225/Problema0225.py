naoAsfaltado=0
maisQue15=0
C=""
quantidade=int(input("Digite a quantidade de praias na regiao: "))

for quantidade in range(quantidade):
    print("Digite o nome da praia ",quantidade)
    nome=input()
    varanista=int(input("Digite a quantidade de varistas: "))
    tipo=int(input("Digite o tipo de praia('0' - acesso nao asfaltado/ '1' - acesso asfaltado): "))
    if tipo==0:
        naoAsfaltado=naoAsfaltado+1
    distancia=float(input("Digite a distancia entre a praia e o centro(km): "))
    if distancia>15:
        maisQue15=maisQue15+1
    if varanista<1000:
        C=C+nome+" "
        C=C+str(distancia)+". "

print("Numero de praias que distam mais de 15km: ",maisQue15)
print("A quantidade media de veranistas , na ultima temporada , nas praias com acesso nao asfaltado: ",naoAsfaltado)
print("O nome e a distancia do centro , em km , de todas as praias de acesso asfaltado que tiveram menos de 1000 veranistas: ",C)



