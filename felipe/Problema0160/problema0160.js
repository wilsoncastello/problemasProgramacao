const prompt = require("prompt-sync")({ sigint: true })

horasExtras = prompt("Digite o número de horas extras: ")
horasFaltadas = prompt("Número de horas faltadas: ")

h = horasExtras - 2/3 * horasFaltadas;

if(h > 2400){
    console.log("Gratificação de R$500,00");
} else {
    if(h > 1800){
        console.log("Gratificação de R$400,00");
    } else {
        if(h > 1200){
            console.log("Gratificação de R$300,00");
        } else {
            if(h > 600){
                console.log("Gratificação de R$200,00");
            } else {
                console.log("Gratificação de R$100,00");
            }
        }
    }
}