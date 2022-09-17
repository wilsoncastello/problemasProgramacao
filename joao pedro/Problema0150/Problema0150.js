const prompt = require("prompt-sync")({ sigint: true });

var preco, tipo, refrigerado, aumento;

preco = Number(prompt("Digite o preco do produto: "));
tipo = String(prompt("Digite o tipo de produto(A - alimentacao; L - limpeza; e V - vestuario): "));


    if(tipo=="A"){
        if (preco <= 25) {
            aumento = preco * 1.08;
        }
        else {
            aumento = preco * 1.15;
        }
        
    }
    if(tipo=="L"){
        if (preco <= 25) {
            aumento = preco * 1.05;
        }
        else {
            aumento = preco * 1.12;
        }
        
    }
    if(tipo=="V"){
        if (preco <= 25) {
            aumento = preco * 1.1;
        }
        else {
            aumento = preco * 1.18;
        }
    }
        refrigerado = String(prompt("Classifique o produto (S - produto que necessita de refrigeracao; e N - produto que nao necessita de refrigeracao):"));

        switch (refrigerado) {
            case "S":
                if (aumento <= 50) {
                    console.log("Novo preco: " + aumento + ". Classificacao: Barato");
                }
                else {
                    if (aumento > 50 && aumento < 120) {
                        console.log("Novo preco: " + aumento + ". Classificacao: Normal");
                    }
                    else {
                        console.log("Novo preco: " + aumento + ". Classificacao: Caro");
                    }
                }
                break;
            case "N":
                aumento = aumento * 0.97;
                if (aumento <= 50) {
                    console.log("Novo preco: " + aumento + ". Classificacao: Barato");
                }
                else {
                    if (aumento > 50 && aumento < 120) {
                        console.log("Novo preco: " + aumento + ". Classificacao: Normal");
                    }
                    else {
                        console.log("Novo preco: " + aumento + ". Classificacao: Caro");
                    }
                }
        }




