const prompt = require("prompt-sync")({ sigint: true })

var A = [
    [],
    [],
    []
]
var B = [
    [],
    [],
    []
]
var C = [
    [],
    [],
    []
]
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        A[i][j] = prompt("Digite um número para a linha "+i+" e coluna "+j+" da matriz:");
    }
}
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        B[i][j] = prompt("Digite um número para a linha "+i+" e coluna "+j+" da matriz:");
    }
}
for(i=0;i<3;i++){
    k=0;
    for(j=0;j<3;j++){
        C[i][k] = A[i][j];
        k++;
        C[i][k] = B[i][j];
        k++;
    }
}
console.log("A matriz C é: ");
for (i = 0; i < 3; i++) {
    for (j = 0; j < 6; j++) {
        process.stdout.write(C[i][j]+" ");  
    }
    console.log("");
}
