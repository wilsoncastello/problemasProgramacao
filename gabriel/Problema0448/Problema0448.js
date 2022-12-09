function calcularInterseccao(vetorA,vetorB){
       
    var vetorC= Array(10); 
    
    for(var i=0; i<10; i++){
        for(var j =0; j<10; j++){
            if(vetorA[i] == vetorB[j]){
                vetorC[i] = vetorA[i];
            }
                
        }
    }
    
    for(var i=0; i<10; i++){
        for(var j =i+1; j<10; j++){
            if(vetorC[i] == vetorC[j]){
            vetorC[j] = null;
            }
        }
     }
            
            
    return vetorC;
}
   
   
var vetorA= Array(10);
var vetorB = new Array(10);
   
     console.log("Digite os dados do vetor A");
   for(var i=0; i<10; i++){
       vetorA[i] = parseInt(prompt("Digite o valor da posição: "+i));
   }
   
     
   console.log("Digite os dados do vetor B");
   for(var i=0; i<10; i++){
       vetorB[i] = parseInt(prompt("Digite o valor da posição: "+i));
   }
   
   var vetorC = calcularInterseccao(vetorA, vetorB);
   
     console.log("Vetor Intersecção");
   for(var i=0; i<10; i++){
       if(vetorC[i] != null){
       console.log(vetorC[i]);
   }
   }
   