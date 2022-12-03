var vetorA = Array(10);
var vetorB = Array(10);
var fat, j;
 
 
for(var i=0; i<10; i++){
    vetorA[i] = parseInt(prompt("Digite o valor inteiro do vetor A na posição " + i + ": "));
}
 
 
for(var i=0; i<10; i++){
    fat = 1;
    j  = 2;
     
    while(j <= vetorA[i]){
      fat = fat * j;
      j++;
    }
     
    vetorB[i] = fat;
    if(vetorA[i] < 0){
      vetorB[i] = null
    }
     
}
 
var auxiliar = 0;
 
for(var i=0; i<10; i++){
   for(j=i+1; j<10; j++){
       if(vetorB[i] > vetorB[j]){
             auxiliar = vetorB[i];
             vetorB[i] = vetorB[j];
             vetorB[j] = auxiliar;
        }
    }
}
 
console.log("Vetor B: ");
for(var i=0; i<10; i++){
  if(vetorB[i] != null){
    console.log(vetorB[i]);
  }      
}