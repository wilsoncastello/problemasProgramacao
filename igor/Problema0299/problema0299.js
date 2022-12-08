const prompt = require("prompt-sync")({ sigint: true });

var n = parseInt(prompt("Escreve n: "))
var m = parseInt(prompt("Escreve m: "))

var x = new Array(parseInt(n))
var y = new Array(parseInt(m))

for(let i = 0; i < x.length;i++){
    var b = prompt("Escreve numero para x: ")

    x[i] = b;

}

for(let i = 0; i < y.length;i++){
    var c = prompt("Escreve numero para y: ")

    y[i] = c;

}

const v = parseInt(n+m)
var a = new Array(parseInt(v))

for(let i = 0; i < a.length; i=i+2){
    if(i < x.length && i==0){
        a[i] = x[i];
        a[i+1] = y[i];
    }
    else if(i <= x.length && i>0){
        a[i] = x[i-1];
        a[i+1] = y[i-1];
    }
    else{
        a[i] = y[i-2];
    }
}

console.log("x: "+x);
console.log("y: "+y);
console.log("a: "+a);