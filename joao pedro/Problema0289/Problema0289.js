const prompt = require("prompt-sync")({ sigint: true });

var x=0, numero=[],lugares=[],vago=[],pedidos=[],n,y=0;

n=Number(prompt("Digite a quantidade de voos: "))

for(i=0;i<n;i++){
    numero[i]=Number(prompt("Digite o numero do voo "+i+": "));
    
    lugares[i]=Number(prompt("Digite a quantidade de lugares disponiveis no voo "+i+": "));
    
    if(lugares[i]<=0){
        console.log("Voo lotado");
        pedidos[i]=0;
    }
    for(j=0;j<lugares[i];j++){
        x=Number(prompt("Deseja realizar uma reserva para o voo "+i+" ?([1]Sim/[2]Nao/[-1]Para encerrar]): "));
        
        if(x==1){
          if(y==0){
            pedidos[i]=0;
            
            y=1;}
            if(y==1){
                pedidos[i]++;
                console.log("** Pedido efetuado **");
            }
        }
        if(x==-1){
            console.log("** Encerrando programa **");
            return;
        }
        y=0;
    }
    

}
for(i=0;i<n;i++){
    
    vago[i]=lugares[i]-pedidos[i];
    console.log("Numero do voo: "+numero[i]+". Passageiros: "+pedidos[i]+". Lugares vagos: "+vago[i]);
}