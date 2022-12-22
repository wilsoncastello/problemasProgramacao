var soma = 0, resto;
        

var numero = parseInt(prompt("Digite um numero inteiro positivo: "));
        
while(numero > 0){
    resto = 0;
    resto = numero % 10;
    soma = soma + resto;
    numero = parseInt(numero / 10);
            
    }
        
console.log("Soma dos algarismos: "+soma);