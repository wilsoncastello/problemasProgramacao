const prompt = require("prompt-sync")({ sigint: true });

var quantidade,tipo,naoAsfaltado=0,maisQue15=0,varanista,distancia,nome,C="";

quantidade=Number(prompt("Digite a quantidade de praias na regiao: "));

for(i=0;i<quantidade;i++){
    nome=String(prompt("Digite o nome da praia "+i+": "));
    varanista=Number(prompt("Digite o numero medio de varanistas: "));
    
    tipo=Number(prompt("Digite o tipo de praia('0' - acesso nao asfaltado/ '1' - acesso asfaltado): "));
    
    if(tipo==0){
        naoAsfaltado++;
    }
    distancia=Number(prompt("Digite a distancia entre a praia e o centro(km): "));
    
    if(distancia>15){
        maisQue15++;
    }
    if(varanista<1000){
        C=C+nome+" ";
        C=C+distancia+". ";
       
    }
   
}
console.log("Numero de praias que distam mais de 15km: "+maisQue15);
    console.log("A quantidade media de veranistas , na ultima temporada , nas praias com acesso nao asfaltado: "+naoAsfaltado);
    console.log("O nome e a distancia do centro , em km , de todas as praias de acesso asfaltado que tiveram menos de 1000 veranistas: "+C);