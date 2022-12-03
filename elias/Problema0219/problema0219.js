const prompt = require("prompt-sync")({ sigint: true });

var numerador1 = parseInt(prompt("Digite o numerador da primeira fração:"));
var denominador1 = parseInt(prompt("Digite o denominador da primeira fração:"));
var numerador2 = parseInt(prompt("Digite o numerador da primeira fração:"));
var denominador2 = parseInt(prompt("Digite o denominador da segunda fração:"));
for(i=1;i>0;i++){
    resto = (denominador1 * i) % denominador2;
    if(resto==0){
        break;
    }
}
mmc = denominador1 * i;
resultado = (mmc/denominador1*numerador1) + (mmc/denominador2*numerador2);
if(resultado != mmc){
    console.log("A soma das frações é: "+resultado+"/"+mmc);
    if(resultado % mmc == 0){
        resultadoFinal = resultado / mmc;
        console.log("O resultado final é: "+resultadoFinal);
    }
}
else 
    console.log("A soma das frações é: "+1);