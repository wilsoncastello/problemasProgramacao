const prompt = require("prompt-sync")({ sigint: true })

function pesoHomem(boolean alt){
    return 72.7 * alt - 58;
}
function pesoMulher(boolean alt){
    return 62.1 * alt -44.7;
}

var alt, peso;
var sexo;
alt=prompt("Digite a altura: ");
sexo=prompt("Digite o sexo: ");
if(sexo == "masculino"){
    peso = pesoHomem(alt);
} else{
    if(sexo == "feminino"){
    peso = pesoMulher(alt);
}
}
console.log("O peso ideal é "+peso);