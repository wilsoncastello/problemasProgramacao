const prompt = require("prompt-sync")({ sigint: true });

var decimal,octal,resto,j,quantidade;

quantidade=parseInt(prompt("Digite a quantidade de numeros: "));

for(i=0;i<quantidade;i++){
    decimal=0;
    
    j=0;
    octal=parseInt(prompt("Digite um valor na base 8: "));
    
    resto = octal;
    while(resto > 0) {
        
        decimal += parseInt(resto%10)*Math.pow(8,j)
        resto =parseInt(resto/10) 
        j += 1;
    }
    console.log("Numero na base 8: "+octal+". Numero na base 10: "+decimal);

}