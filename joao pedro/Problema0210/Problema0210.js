const prompt = require("prompt-sync")({ sigint: true });

var x,valor=0,totalP=0,totalV=0,tipo;

x=Number(prompt("Digite a quantidade de compras: "));

for(i=0;i<x;i++){
    tipo=prompt("Digite tipo de compra para o produto  ('v' para compras a vista/ 'p' para compras a prazo/ 'x' para encerrar o programa): ");
    
    if(tipo.match("x")){
        console.log("--Finalizando programa--");
        return;
    }

    valor=Number(prompt("Digite o valor da compra do produto: "));
    
    if(tipo.match("v")){
        totalV=totalV+valor;
    }
    if(tipo.match("p")){
        totalP=totalP+valor;
    }
    


}
console.log("Total a vista: "+totalV);
    console.log("Total a prazo: "+totalP);
    

