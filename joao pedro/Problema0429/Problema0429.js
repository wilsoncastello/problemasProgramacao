const prompt = require("prompt-sync")({ sigint: true });
function funcao(x,y,n){
    for(i=0;i<n;i++){
        console.log("Digite um valor para o vetor de numeros (posicao "+i+"): ");
        x[i]=Number(prompt(""))

    }
    for(i=0;i<n;i++){
        console.log("Digite um valor para o vetor de caracteres (posicao "+i+"): ");
        y[i]=prompt("")

    }
    
    for(i=0;i<n;i++){
        console.log(y[i].repeat(x[i]));
    }

}




function main(){
    var n=0
    n=Number(prompt("Digite o tamanho dos vetores: "))
    var x=[n],y=[n]
    funcao(x,y,n)
}

main()