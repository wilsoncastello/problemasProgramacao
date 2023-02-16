const prompt = require("prompt-sync")({ sigint: true })

function descreveMes(){
    numero = parseInt(prompt("Digite um número correspondente a um mês:"));
    switch(numero){
        case 1:
            console.log("O número digitado corresponde ao mês de Janeiro");
            break;
        case 2:
            console.log("O número digitado corresponde ao mês de Fevereiro");
            break;
        case 3:
            console.log("O número digitado corresponde ao mês de Março");
            break;
        case 4:
            console.log("O número digitado corresponde ao mês de Abril");
            break;
        case 5:
            console.log("O número digitado corresponde ao mês de Maio");
            break;
        case 6:
            console.log("O número digitado corresponde ao mês de Junho");
            break;
        case 7:
            console.log("O número digitado corresponde ao mês de Julho");
            break;
        case 8:
            console.log("O número digitado corresponde ao mês de Agosto");
            break;
        case 9:
            console.log("O número digitado corresponde ao mês de Setembro");
            break;
        case 10:
            console.log("O número digitado corresponde ao mês de Outubro");
            break;
        case 11:
            console.log("O número digitado corresponde ao mês de Nuvembro");
            break;
        case 12:
            console.log("O número digitado corresponde ao mês de Dezembro");
            break;
        default:
            console.log("O número digitado não corresponde a nenhum mês!!");
    }
}
descreveMes();