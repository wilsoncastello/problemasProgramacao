var x = parseFloat(prompt("Digite o valor de x: "));

var soma = 0;
var fat = 1;


for(var i=0;i<10; i++){
    j = i;
    fat = 1;
    while(j > 1){
        fat = fat * j;
        j = j-1;
    }
    
    soma = soma + x**i / fat;

}
console.log(soma);