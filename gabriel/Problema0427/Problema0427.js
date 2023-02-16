function converte(numDecimal){
    if(numDecimal != 0){
        numConvertido = "";
        while (numDecimal > 0){
            resto = numDecimal % 2;
            numConvertido = resto + numConvertido;
            numDecimal = parseInt(numDecimal / 2);
        }
    }
    else{
        numConvertido = "0";
    }

    return numConvertido;
}

numDecimal = parseInt(prompt("Digite um numero na base decimal: "));
console.log("Número "+numDecimal+ " em binário: "+converte(numDecimal));