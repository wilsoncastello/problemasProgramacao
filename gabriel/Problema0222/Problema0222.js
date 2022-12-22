var numero = parseInt(prompt("Digite um número inteiro positivo: "));
var primo = true;
        
for(var i=2; i<numero; i++){
    if(numero % i == 0){
        primo = false;
            console.log("o número "+numero+ " não é primo");
            break;
            }
        }
if(primo == true){
    console.log("O numero "+numero+ " é primo")
}