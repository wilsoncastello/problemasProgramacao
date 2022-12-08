var vetorA = Array(12);
var vetorB = Array(12);
       
for(var i=0; i<12; i++){
    vetorA[i] = parseInt(prompt("Digite o valor do vetor A correspondente a posição "+i))
}
       
for(var i=0; i<12; i++){
    if(vetorA[i] % 2 == 0){
        vetorB[i] = vetorA[i];
    }
           
    else{
        vetorB[i] = vetorA[i] * 2;
   }
}
       
console.log("Vetor B");
for(var i=0; i<12; i++){
    console.log(vetorB[i]);
}