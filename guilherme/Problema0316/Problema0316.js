const prompt = require("prompt-sync")({ sigint: true })

var cons, x
var a = []
var b = []

console.log("Digite 5 valores: ")
for(let i = 0;  i < 5;  i++){
    a[i] = Number(prompt())
    b[i] = Math.pow(a[i],3) 
}
console.log("Digite um número para buscar no vetor B: ") 
x = Number(prompt()) 
while(x != 0){
    cont = 0 
    for(let i = 0;  i < 5;  i++){
        if(x == b[i])
                console.log(x+" existe em B.") 
        else
            cont++ 
    }
    if(cont == 5)
            console.log(x+" não existe em B.") 
            
    console.log("\nDigite outro número ou 0 para encerrar: ") 
    x = Number(prompt()) 
}
console.log("Até mais!") 