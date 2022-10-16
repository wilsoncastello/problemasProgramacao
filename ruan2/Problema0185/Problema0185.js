//Digitar 10 números e imprimir a metade de cada número

var num, metadeN

for(var i=0; i<10; i++){
    num = Number(prompt("Digite um numero: "))
    metadeN = num/2
    console.log("A metade do numero digitado: "+metadeN)
}