const prompt = require("prompt-sync")({ sigint: true })

let A = [
    [],[],[],[]
    ];
let B =  [
    [],[],[],[]
    ];
let C =  [
    [],[],[],[]
    ];
let D =  [
    [],[],[],[]
    ];
let i, j;

console.log("Digite os dados da matriz A: ");
for (i=0;i<3;i++){
    for (j=0;j<4;j++){
        A[i][j] = prompt("Digite o elemento da linha "+i+" coluna "+j+": ");
    }
}
console.log("Digite os dados da matriz B: ");
for (i=0;i<3;i++){
    for (j=0;j<4;j++){
        B[i][j] = prompt("Digite o elemento da linha "+i+" coluna "+j+": ");
    }
}

for (i=0;i<3;i++){
    for (j=0;j<4;j++){
        C[i][j] = A[i][j] + B[i][j];
    }
}
for (i=0;i<3;i++){
    for (j=0;j<4;j++){
        C[i][j] = A[i][j] - B[i][j];
    }
}

console.log("Matriz da soma das duas matrizes ");
for (i=0;i<3;i++){
    for (j=0;j<4;j++){
        console.log(C[i][j]+" ");
    }
    console.log("");
}
console.log("Matriz da diferença das duas matrizes ");
for (i=0;i<5;i++){
    for (j=0;j<3;j++){
        console.log(D[i][j]+" ");
    }
}
