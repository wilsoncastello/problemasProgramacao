var jogadaDado = Array(20);
var  cont1 =0, cont2 =0, cont3 =0, cont4=0, cont5=0, cont6=0;

for(var i=0; i<20; i++){
jogadaDado[i] = parseInt(prompt("valor do dado na jogada nº "+ i + ": "));
}

for(var i=0; i<20; i++){
  switch(jogadaDado[i]){
    case 1:
        cont1++;
        break;

    case 2: 
      cont2++;
      break;

    case 3:
      cont3++;
      break;

    case 4:
      cont4++;
      break;

    case 5:
      cont5++;
      break;

    case 6:
      cont6++;
      break;
      
  }
}

console.log("Frequência do numero 1: " + cont1);
console.log("Frequência do numero 2: " + cont2);
console.log("Frequência do numero 3: " + cont3);
console.log("Frequência do numero 4: " + cont4);
console.log("Frequência do numero 5: " + cont5);
console.log("Frequência do numero 6: " + cont6);