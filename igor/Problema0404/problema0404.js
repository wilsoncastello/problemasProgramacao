const prompt = require("prompt-sync")({ sigint: true });

function tabuada(n){
    for(let i = 1; i<=10;i++){
        let m= n*i
        console.log(n+"*"+i+"= "+m)
    }
}





let n = parseInt(prompt("Escreve um numro: "))
tabuada(n)