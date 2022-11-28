const prompt = require("prompt-sync")({ sigint: true });

const x = []
const y = []
const a = []
const b = []
const uniao = []
const interseccao = []


for(let i=0;i<10;i++){
    const n = parseInt(prompt("Escreve x para "+i+": "))
    x[i] = n
    const m = parseInt(prompt("Escreve y para "+i+": "))
    y[i] = m

    a[i] = parseInt(x[i] + y[i]);
    b[i] = parseInt(x[i] * y[i]);
    uniao[i] = x[i]
}

for (let i = 10; i < 20; i++) {
    let s = parseInt(i - 10);
    uniao[i] = y[s];
}

let u = uniao.filter((item,index) => uniao.indexOf(item) === index);

for(let i=0;i<10;i++){
    for(let j=0;j<10;j++){
        if(x[i] == y[j]){
            interseccao[i] = x[i];
        }
    }
}

let i = interseccao.filter((item,index) => interseccao.indexOf(item) === index);

let diferencia = uniao.filter(element => !interseccao.includes(element))

console.log(a)
console.log(b)
console.log(u)
console.log(i)
console.log(diferencia)

