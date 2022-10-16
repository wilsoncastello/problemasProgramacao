const prompt = require("prompt-sync")({ sigint: true });

var angulo,seno,cosseno,tangente,secante,cossecante,cotangente;

angulo=Number(prompt("Digite um angulo: "));

seno=Math.sin(angulo*Math.PI/180); 
cosseno=Math.cos(angulo*Math.PI/180);
tangente=Math.tan(angulo*Math.PI/180);
secante=Math.pow(cosseno,-1);
cossecante=Math.pow(seno,-1);
cotangente=Math.pow(tangente,-1);
console.log("Seno de "+angulo+": "+seno);
console.log("Cosseno de "+angulo+": "+cosseno);
console.log("Tangente de "+angulo+": "+tangente);
console.log("Secante de "+angulo+": "+secante);
console.log("Cossecante de "+angulo+": "+cossecante);
console.log("Cotangente de "+angulo+": "+cotangente);