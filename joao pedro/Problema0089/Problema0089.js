const prompt = require("prompt-sync")({ sigint: true });

var angulo;

angulo=Number(prompt("Digite um angulo para ser classificado em agudo/reto/obtuso: "));

if (angulo == 90) {
    console.log("O angulo de "+angulo+" e: Reto");

} else {
    if (angulo > 90) {
        console.log("O angulo de "+angulo+" e: Obtuso");

    } else {
        console.log("O angulo de "+angulo+" e: Agudo");

    }

}