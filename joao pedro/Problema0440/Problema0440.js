const prompt = require("prompt-sync")({ sigint: true });

function funcao(x, i, z) {
    if (z == 1) {
        return i

    }
    else {
        return -1
    }
}


function main() {
    var x = [], y, i = 0, z = 0, h, a

    console.log("Digite o tamanho do vetor: ")
    y=Number(prompt(""))
    for(i=0;i<y;i++) {
        console.log("Digite um valor para a posicao " + i + ": ")
        x[i] = Number(prompt(""))
        if (x[i] < 0 && z == 0) {
            h = i
            z=1
            funcao(x, i, z)
        }

        
    }
    for (j = 0; j < i; j++) {
        if (z == 0) {
            funcao(x, j, z);
            a = j;
        }


    }
    if (z == 0) {
        console.log(funcao(x, a, z))
    }
    else {
        console.log(funcao(x, h, z))
    }



}
main()