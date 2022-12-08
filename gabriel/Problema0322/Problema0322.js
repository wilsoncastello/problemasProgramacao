var mensagem = prompt("Digite uma mensagem");
        
var mensagemLower = mensagem.toLowerCase();

var contA=0, contE=0, contI=0, contO=0, contU=0;
 

for(var i=0; i<mensagem.length; i++){
    switch(mensagemLower[i]){
        
        case 'a':
            contA = contA + 1;
            break;
            
        case 'e': 
            contE = contE + 1;
            break;
            
        case 'i': 
            contI = contI + 1;
            break;
            
        case 'o':
            contO = contO + 1;
            break;
            
        case 'u': 
            contU = contU + 1;
            break;
    }
}

console.log("Quantidade de 'a' e 'A' na mensagem digitada: " + contA);
console.log("Quantidade de 'e' e 'E' na mensagem digitada: " + contE);
console.log("Quantidade de 'i' e 'I' na mensagem digitada: " + contI);
console.log("Quantidade de 'o' e 'O' na mensagem digitada: " + contO);
console.log("Quantidade de 'u' e 'U' na mensagem digitada: " + contU);