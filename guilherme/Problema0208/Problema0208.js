const prompt = require("prompt-sync")({ sigint: true })
<<<<<<< HEAD
var sen=0, fat = 1, sinal = 1
var x = Number(prompt("Digite um número em graus: "))
var y = x * 3.141592 / 180
for(let i = 1; i < 10; i += 2){
    fat = 1
    for(let j = 1; j < i + 1; j++)
        fat *= j
    sen += Math.pow(y, i) / fat * (sinal)
    sinal = sinal * (-1)
}
console.log("O seno de " + x + " é " + sen)
=======

var fat, y;
var sen = 0
var sinal = 1
var x = Number(prompt("Digite um número em graus: ")) 

y = x * 3.141592 / 180;
        for(let i = 1; i < 20; i++){
            fat = 1
            for(let j = 1; j < i + 1; j++)
                fat *= j;
            sen += Math.pow(y, i) / fat * (sinal)
            sinal = sinal * (-1)
            i++
        }
console.log("O seno de " + x + " é: " + sen)
>>>>>>> 542291d04ac0dedbaeac1d2b263179c7fcdf0afc
