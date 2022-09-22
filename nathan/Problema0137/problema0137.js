const prompt = require("prompt-sync")({ sigint: true });

var dia = Number(prompt("Digite o dia da data a ser inserida: "));
var mes = Number(prompt("Digite o mes da data a ser inserida: "));
var ano = Number(prompt("Digite o ano da data a ser inserida: "));

validarAno = false;

if(dia > 0 && dia <= 31){
    if(mes > 0 && mes <= 12){
        if(ano > 0){
            validarAno = true;
        }
    }
}

console.log("Data inserida é valido? " + validarAno);