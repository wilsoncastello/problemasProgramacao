const prompt = require("prompt-sync")({ sigint: true });

var y = prompt("Digite um número:")
console.log("Divisores:")
        for(var i = y; i>0;i--){
            if(y%i==0){
               x = x.concat(i+", ") 
            }
        }
        console.log(x);