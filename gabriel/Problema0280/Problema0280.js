let vetorA = Array(10);
let vetorB = Array(10);

console.log("Preencha o vetor A");
for(let i=0; i<10; i++){
  vetorA[i] = parseInt(prompt("Digite o valor inteiro da posiçao " +i+ ": "))
  
}

let j=0;
for(let i=0; i<10; i++){
  if(vetorA[i] > 0){
    vetorB[j] = vetorA[i];
    j = j+1;
  }
}
console.log("Vetor B");
for(let i=0; i<j; i++){
  console.log(vetorB[i]);
}