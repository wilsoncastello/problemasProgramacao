const prompt = require("prompt-sync")({ sigint: true });

var data,dia="",mes="",ano="";

data=prompt("Digite uma data (DD/MM/AAAA): ");

for (i = data.lastIndexOf("/") - 1; i > data.indexOf("/"); i--) {
    mes = data.charAt(i) + mes;

}

for (i = data.indexOf("/") - 1; i >= 0; i--) {
    dia = data.charAt(i) + dia;

}

for (i = data.length - 1; i > data.lastIndexOf("/"); i--) {
    ano = data.charAt(i) + ano;
}

if (mes.includes("01"))
    console.log(dia + "/Janeiro/" + ano);

if (mes.includes("02"))
    console.log(dia + "/Fevereiro/" + ano);

if (mes.includes("03"))
    console.log(dia + "/Marco/" + ano);

if (mes.includes("04"))
    console.log(dia + "/Abril/" + ano);

if (mes.includes("05"))
    console.log(dia + "/Maio/" + ano);

if (mes.includes("06"))
    console.log(dia + "/Junho/" + ano);

if (mes.includes("07"))
    console.log(dia + "/Julho/" + ano);

if (mes.includes("08"))
    console.log(dia + "/Agosto/" + ano);

if (mes.includes("09"))
    console.log(dia + "/Setembro/" + ano);

if (mes.includes("10"))
    console.log(dia + "/Outubro/" + ano);

if (mes.includes("11"))
    console.log(dia + "/Novembro/" + ano);

if (mes.includes("12"))
    console.log(dia + "/Dezembro/" + ano);
