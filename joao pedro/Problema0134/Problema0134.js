const prompt = require("prompt-sync")({ sigint: true });

var angulo, seno,cosseno;

angulo=Number(prompt("Digite um angulo: "));

if ((angulo >= 90 && angulo <= 180) || (angulo >= 270 && angulo <= 360)) {
    seno=Math.sin(angulo*Math.PI/180); 
    console.log("Seno de " + angulo + ": " + seno);

} else {
    cosseno=Math.cos(angulo*Math.PI/180);
    console.log("Cosseno de " + angulo + ": " + cosseno);

}