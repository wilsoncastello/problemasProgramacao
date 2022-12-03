let vetorA = Array(10);
let vetorB = Array(10);
let vetorC = Array(20);

console.log("Digite os dados do vetor A");
for(var i=0; i<10; i++){
vetorA[i] = parseFloat(prompt("Digite o valor numérico da posiçao "+i));
}

console.log("Digite os dados do vetor B");
for(var i=0; i<10; i++){
vetorB[i] = parseFloat(prompt("Digite o valor numérico da posiçao "+i));
}

let j = 0;
let k = 0;
for(var i=0; i<20; i++){
  if(i % 2 == 0){
    vetorC[i] = vetorA[j];
    j++;
  }

  else{
    vetorC[i] = vetorB[k];
    k++;
  }
}
console.log("Vetor C")
for(var i=0; i<20; i++){
  console.log(vetorC[i])
}