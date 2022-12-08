const prompt = require("prompt-sync")({ sigint: true });

const x = Array.from(Array(5), () => new Array(5))

for(let i=0;i<x.length;i++){
    for(let j=0;j<x.length;j++){
        let y = parseInt(prompt(i+" "+j+": "))
        x[i][j] = y;
    }
}

let m = parseInt(0)

for(let i=0;i<x.length;i++){
    for(let j=0;j<x.length;j++){
        m = Math.max(m, x[i][j])
    }
}

let v = parseInt(m+1)
const f = new Array(parseInt(v)).fill(0)

for(let i=0;i<x.length;i++){
    for(let j=0;j<x.length;j++){
        f[x[i][j]] = parseInt(f[x[i][j]] + 1)
    }
}

for (let i = 0; i < m + 1; i++){
    if (f[i] > 1) {
        console.log(i + ": "+f[i]);
    }
}