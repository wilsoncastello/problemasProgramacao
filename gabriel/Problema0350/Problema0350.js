var palavra = prompt("Digite uma palavra");
var palavra2 = prompt("Digite outra palavra");

var vetorPalavra = Array(palavra.length);
var vetorPalavra2 = Array(palavra2.length);
var permuta = true;

for(var i=0; i<palavra.length; i++){
  vetorPalavra[i] = palavra[i];
}

for(var i=0; i<palavra.length; i++){
  vetorPalavra2[i] = palavra2[i];
}

if(palavra.length != palavra2.length) {
    permuta = false;
}

else{

    for(var i=0; i<palavra.length; i++){
        for(var j=0; j<palavra2.length; j++){
            if(vetorPalavra[i] == vetorPalavra2[j]){
                vetorPalavra[i] = 0;
                vetorPalavra2[j] = 0;
              
            }
        }
    }
   

    for(var i=0; i<palavra.length; i++){
        if(vetorPalavra[i] != 0 || vetorPalavra2[i] != 0){
            permuta = false;
        }
    }
}   
console.log("A primeira palavra é uma permutação da segunda? : "+permuta);