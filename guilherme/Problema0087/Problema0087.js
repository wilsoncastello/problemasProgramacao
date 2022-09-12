const prompt = require("prompt-sync")({ sigint: true })

var h = Number(prompt("Digite a hora: "))
var m = Number(prompt("Digite o minut: "))
var s = Number(prompt("Digite o segundo: "))

s = s + 1;

if(s >= 60){
    s = 0;
    m = m + 1;
}
if(m >= 60){
    m = 0;
    h = h + 1;
}
if(h >= 24){
    h = 0;
}

console.log(h + "h" + m + "m" + s + "s")