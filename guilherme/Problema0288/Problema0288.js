const prompt = require("prompt-sync")({ sigint: true })

var mesa = []
var n = -1, m, lugar, encerrar

for(let i = 0; i < 10; i++)
    mesa[i] = 0

while(n != 0){
    n = Number(prompt("Digite qual mesa você quer reservar: "))
    m = 0;
    if(n > 10 || n < 0){
        console.log("Não existe uma mesa com esse número!");
    }else if(n != 0){
        lugar = 5 - mesa[n-1]
        if(lugar > 0){
            console.log("Mesa "+n)
            m = Number(prompt("Digite o número de lugares até "+lugar+": "))
            while(m > lugar || m < 1)
                m = Number(prompt("Digite um valor até "+lugar+": "))
            mesa[n-1] = mesa[n-1] + m
        }else{
            console.log("Essa mesa não tem lugares disponíveis!")
        }
    }else{
        console.log("Até mais!")
    }

    encerrar = 0;
    for(let i = 0; i < 10; i++){
        if(mesa[i] == 5)
            encerrar++
    }
    if(encerrar == 10){
        console.log("Até mais!")
        break
    }
}