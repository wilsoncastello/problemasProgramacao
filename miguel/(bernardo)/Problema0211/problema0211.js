const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores e contagem de ingressos
var socio = 0;
var naoSocio = 0;
for (var i = 0; i < 10; i++) {
    var ingresso = prompt("Digite o tipo do " + (i + 1) + " ingresso(socio ou nao-socio) ou digite fim para finalizar: ");
    if (ingresso.toLowerCase() == "socio") {
        socio++;
    }
    else if (ingresso.toLowerCase() == "nao-socio") {
        naoSocio++;
    }
    else if (ingresso.toLowerCase() == "fim") {
        break;
    }
    else {
        console.log("Entrada " + ingresso + " não é reconhecida");
        break;
    }
}

// Cálculos
var percentual = 0;
var ingressos = socio + naoSocio;
if (ingressos > 0) {
    percentual = (socio * 100) / ingressos;
}
var valorSocios = 50 * socio;
var valorNaoSocios = 100 * naoSocio;
var valorTotal = valorSocios + valorNaoSocios;

// Saída
console.log("A quantidade de ingressos para sócios é: " + socio);
console.log("A quantidade de ingressos para não_sócios é: " + naoSocio);
console.log("O percentual de ingressos para sócios é: " +  percentual  + "%");
console.log("O valor recebido de sócios é: R$" + Math.round(valorSocios * 100) / 100);
console.log("O valor recebido de não-sócios é: R$ " + Math.round(valorNaoSocios * 100) / 100);
console.log("O valor total recebido é: R$" + Math.round(valorTotal * 100) / 100);