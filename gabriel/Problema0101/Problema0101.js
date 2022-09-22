//Elabore um algoritmo que tome como entrada três valores e os imprima em ordem crescente.

const prompt = require('prompt-sync')({sigint: true});

let n1 = parseFloat(prompt("Digite um primeiro valor: "));
let n2 = parseFloat(prompt("Digite um segundo valor: "));
let n3 = parseFloat(prompt("Digite um terceiro valor: "));

if(n1 <= n2 && n2 <= n3){
    console.log("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);

  } else if(n1 <= n3 && n3 <= n2){
        console.log("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
    
    } else if(n2 <= n1 && n1 <= n3){
            console.log("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
        
      } else if(n2 <= n3 && n3 <= n1){
                console.log("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
             
         } else if(n3 <= n1 && n1 <= n2){
                    console.log("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
                
             } else{
                        console.log("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
                    }