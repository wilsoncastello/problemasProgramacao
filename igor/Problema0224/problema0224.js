const prompt = require("prompt-sync")({ sigint: true });

var arrecado = 0;

    for(var i=0;i<10;i++){

        var nome = prompt("Escrever Nome cliente: ");
            
        var pagar = parseFloat(prompt("Valor a pagar: "));

        if( pagar >= 250){
            console.log("Nome cliente: "+nome);
            console.log("Valor compar: "+pagar);
            console.log("Desconto: 20%");
            var pDescontado = parseFloat((pagar*80)/100);
            console.log("Valor descontado: "+pDescontado);
            arrecado = parseFloat(arrecado + ((pagar*20)/100));

        }else{
            console.log("Nome cliente: "+nome);
            console.log("Valor compar: "+pagar);
            console.log("Desconto: 15%");
            var pDescontado = parseFloat((pagar*85)/100);
            console.log("Valor descontado: "+pDescontado);
            arrecado = parseFloat(arrecado + ((pagar*15)/100));
        }
            

    }

    console.log("Total arrecado: "+arrecado);
    