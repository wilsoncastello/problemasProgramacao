var frase = (prompt("Digite uma frase: "))
var fraseSemEspaco = frase.replace(" ", "");
var fraseLower = fraseSemEspaco.toLowerCase();
var vetorContador = Array(fraseSemEspaco.length);
var vetorFrase = Array(fraseSemEspaco.length);

for(var i=0;i<fraseSemEspaco.length; i++){
  vetorFrase[i] = fraseSemEspaco[i];
}

for(var i=0; i<fraseSemEspaco.length; i++){
    vetorContador[i] = 1;
    for(var j=i+1; j<fraseSemEspaco.length; j++){
    if(vetorFrase[i] == vetorFrase[j]){
        vetorContador[i] = vetorContador[i] + 1;
        vetorFrase[j] = 0
    }
  }
}


for(var i=0; i<fraseSemEspaco.length; i++){
    if(vetorFrase[i] != 0 && vetorContador[i] > 1){
        console.log("A letra "+vetorFrase[i] + " aparece " + vetorContador[i] + " vezes");
    }
}