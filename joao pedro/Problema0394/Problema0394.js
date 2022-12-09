const prompt = require("prompt-sync")({ sigint: true });

var gasto=[[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0]], maiorGasto=0, ano=0, mes=0, consumo1=0, consumo2=0, medio1=0,medio2=0

for(i=0;i<2;i++){
    for(j=0;j<12;j++){
        console.log("Digite o gasto do mes "+j+" no ano "+i+": ")
        gasto[j][i]=Number(prompt(""))
        if(gasto[j][i]>maiorGasto){
            maiorGasto=gasto[j][i];
            ano=i;
            mes=j;
        }
        if(i==0){
            consumo1=gasto[j][i]+consumo1;
            
        } else{
            consumo2=gasto[j][i]+consumo2;
        }
    }
}
console.log("Consumo medio em 2020 (ano 0): "+consumo1/12);
console.log("Consumo medio em 2022 (ano 1): "+consumo2/12);
 console.log("Maior gasto de energia (Mes/Ano): "+mes+"/"+ano);

 console.log("Consumo em 2020 (ano 0): "+consumo1);
 console.log("Consumo em 2022 (ano 1): "+consumo2);