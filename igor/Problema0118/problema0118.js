const prompt = require("prompt-sync")({ sigint: true });

var sigla = prompt("escreve a sigla do estado: ")

switch (sigla){
    case "AC": console.log("Você é do Acre");
        break;
    case "AL": console.log("Você é de Alagoas");
        break;
    case "AP": console.log("Você é do Amapa");
        break;
    case "AM": console.log("Você é do Amazonas");
        break;
    case "BA": console.log("Você é baiano");
        break;
    case "CE": console.log("Você é do Ceara");
        break;
    case "DF": console.log("Você é do Distrito Federal");
        break;
    case "ES": console.log("Você é do Espirito Santo");
        break;
    case "GO": console.log("Você é de Goias");
        break;
    case "MA": console.log("Você é do Maranhao");
        break;
    case "MT": console.log("Você é do Mato Grosso");
        break;
    case "MS": console.log("Você é do Mato Grosso do Sul");
        break;
    case "MG": console.log("Você é mineiro");
        break;
    case "PA": console.log("Você é do Para");
        break;
    case "PB": console.log("Você é de Paraiba");
        break;
    case "PR": console.log("Você é do Parana");
        break;
    case "PE": console.log("Você é do Pernambuco");
        break;
    case "PI": console.log("Você é do Piaui");
        break;
    case "RJ": console.log("Você é carioca");
        break;
    case "RN": console.log("Você é do Rio Grande do Norte");
        break;
    case "RS": console.log("Você é do Rio Grande do Sul");
        break;
    case "RO": console.log("Você é de Rondonia");
        break;
    case "RR": console.log("Você é de Roraima");
        break;
    case "SC": console.log("Você é catarinense");
        break;
    case "SP": console.log("Você é paulista");
        break;
    case "SE": console.log("Você é do Sergipe");
        break;
    case "TO": console.log("Você é do Tocantins");
        break;   
}