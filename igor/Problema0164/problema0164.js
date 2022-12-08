const prompt = require("prompt-sync")({ sigint: true });


var vTotalVista=0, vTotalPrazo=0, vTotal=0, v1Prestacao=0;

for(var i=0;i<15;i++){
    var codigo = prompt("Escreve Codigo: ");
    var valor = parseFloat(prompt("Valor transacao: "));
    
    if(codigo=="V"){
        vTotalVista = valor + vTotalVista;
        vTotal = valor + vTotal;

    }else if(codigo=="P"){
        vTotalPrazo = valor + vTotalPrazo;
        vTotal = valor + vTotal;
        var p1 = valor/3;
        v1Prestacao = p1 + v1Prestacao;
    }
}

console.log("Valor total transacao vista: "+vTotalVista);
console.log("Valor total trasacao a prazo: "+vTotalPrazo);
console.log("Valor total da transacoes: "+vTotal);
console.log("Valores total primeiras parcelas: "+v1Prestacao);