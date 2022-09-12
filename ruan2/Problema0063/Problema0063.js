const prompt = require("prompt-sync")({sigint:true});

    /*Faça um algoritmo que leia os preços de três mercadorias em 01/04 e 01/05 e 
    tendo como base a variação dos preços dessas mercadorias,
    calcule a taxa de inflação ocorrida neste período. */

    var prod1_0104, prod1_0104, prod1_0104;
    var prod1_0105, prod1_0105, prod1_0105;

    //Entrada de dados
    console.log("Digite o Preço dos dias 01/04");
    prod1_0104 = Number(prompt("Preço do primeiro produto: "));
    prod2_0104 = Number(prompt("Preço do segundo produto: "));
    prod3_0104 = Number(prompt("Preço do terceiro produto: "));
    console.log("Digite o Preço dos dias 01/05");
    prod1_0105 = Number(prompt("Preço do primeiro produto: "));
    prod2_0105 = Number(prompt("Preço do segundo produto: "));
    prod3_0105 = Number(prompt("Preço do terceiro produto: "));

    //Processamento
    taxa1 = ((prod1_0105 - prod1_0104)/prod1_0104)*100;
    taxa2 = ((prod2_0105 - prod2_0104)/prod2_0104)*100;
    taxa3 = ((prod3_0105 - prod3_0104)/prod3_0104)*100;

    //Saída de dados
    console.log("Taxa de inflação (em porcentagem) do primeiro produto: "+taxa1);
    console.log("Taxa de inflação (em porcentagem) do segundo produto: "+taxa2);
    console.log("Taxa de inflação (em porcentagem) do terceiro produto: "+taxa3);