nome=input("Digite seu nome completo: ")
tamanho=0
ultimoNome=""
primeiroNome=""
meio=""
for x in (nome):
    tamanho+=1

i=tamanho-1

while(i>nome.rindex(" ")):
    ultimoNome=nome[i]+ultimoNome
    i-=1

primeiroNome=nome[0]+primeiroNome

j=nome.rindex(" ")-1
while (j >= nome.index(" ")) :
            j-=1
            meio = nome[j + 1] + ". " + meio
            
            
            

print("Referencia bibliografica: "+ultimoNome+" , "+primeiroNome+". "+meio)
