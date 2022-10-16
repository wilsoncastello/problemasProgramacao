const prompt = require("prompt-sync")({ sigint: true });

    var peso = prompt("Digite um peso na Terra: ");
    
    console.log("1 - Mercúrio");
    console.log("2 - Vênus");
    console.log("3 - Marte");
    console.log("4 - Júpiter");
    console.log("5 - Saturno");
    console.log("6 - Urano");
    console.log("7 - Netuno");
    var n = prompt("Digite o número de um planeta: ");

    switch (n){
        case '1': console.log("Peso em Mercúrio: "+peso*0.37);
        break;
        case '2': console.log("Peso em Vênus: "+peso*0.88);
        break;
        case '3': console.log("Peso em Marte: "+peso*0.38);
        break;
        case '4': console.log("Peso em Júpiter: "+peso*2.64);
        break;
        case '5': console.log("Peso em Saturno: "+peso*1.15);
        break;
        case '6': console.log("Peso em Urano: "+peso*1.17);
        break;
        case '7': console.log("Peso em Netuno: "+peso*1.18);
        break;
        default: console.log("Entrada Inválida!");
        break;
    }