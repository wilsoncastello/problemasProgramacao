const prompt = require("prompt-sync")({ sigint: true });

var idade = prompt("Digte a idade do nadador: ")

if (idade > 60) {
    console.log("Categoria Senior");
}else if (idade > 18) {
    console.log("Categoria Adulto");
}else if (idade > 11) {
    console.log("Categoria Juvenil");
}else if (idade > 5) {
    console.log("Categoria Infantil");
}else {
    console.log("Sem Categoria")
}