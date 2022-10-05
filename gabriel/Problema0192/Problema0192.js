const prompt = require('prompt-sync')({ sigint: true });

console.log("Digite o primeiro e o último valor inteiro de um intervalo");

let n0 = parseInt(prompt());
let nx = parseInt(prompt());

if(n0 < nx){
    for(let i = n0; i<nx + 1; i++){
        
        console.log(i);
    }
  }
else{
    for(let i = nx; i<n0 + 1; i++){
       
        console.log(i);   
                }
            }