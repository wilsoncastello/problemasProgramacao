const prompt = require("prompt-sync")({ sigvar: true });

function ordemVetor(vetor, n){
    var i = 0;
    var valor = vetor[i];
    var verificacao = false;
       
    for (var j = 1; j < vetor.length; j++) {
        valor++;
        if(valor == vetor[j]){
            verificacao = true;
        }else{
            verificacao = false;
            break;
        }
    }
    if(verificacao == true){
        const msg = "1";
        return msg;
    }
       
    valor = vetor[i];
    for (var j = 1; j < vetor.length; j++) {
        valor--;
        if(valor == vetor[j]){
            verificacao = true;
        }else{
            verificacao = false;
            break;
        }
    }

    if(verificacao == true){
        const msg = "2";
        return msg;
    }else{
        const msg = "0";
        return msg;
    }
}


n = parseInt(prompt("Digite o tamanho do vetor: "))
vetor = [n]

for(var i = 0; i < n; i++){
    vetor[i] = parseInt(prompt("Digite o vetor na posição ["+i+"]: "))
}

console.log(ordemVetor(vetor, n))
