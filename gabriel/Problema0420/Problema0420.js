function tirarRaiz(radicando, indice){
    var raiz = 0, variavel = 1;

    for(var i=0; i<radicando; i++){
        variavel = 1;
        for(var j=0; j<indice; j++){
            variavel = variavel * i;
        }

        if(variavel == radicando){
            raiz = i;
        }
    }

    return raiz;
}

radicando = parseInt(prompt("Digite um radicando inteiro: "));

while(radicando < 0){
    console.log("Inválido");
    radicando = parseInt(prompt("Digite um radicando inteiro: "));
}

indice = parseInt(prompt("Digite um indice inteiro: "));

while(indice < 2){
    console.log("Inválido");
    indice = parseInt(prompt("Digite um indice inteiro: "));
}

raiz = tirarRaiz(radicando, indice);

if(radicando == 0){
    console.log("Resultado: 0");
}

else if(radicando == 1){
    console.log("Resultado: 1");
}

else if(raiz == -1){
    console.log("Não existe raiz exata");
}

else{
    console.log("Resultado: "+raiz);
}