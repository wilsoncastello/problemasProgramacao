var vetor = Array(15);
var existe30 = false;

for(var i=0; i<15; i++){
  vetor[i] = parseInt(prompt("Digite o elemento inteiro da posiçao " +i))
}



console.log("Posiçoes do vetor onde o valor armazenado é igual a 30");
for(var i=0; i<15; i++){
  if(vetor[i] == 30){
    existe30 = true;
    console.log("Posiçao: " +i);
  }
}
if(existe30 == false){
  console.log("Nenhuma posição contem o valor igual a 30")
}