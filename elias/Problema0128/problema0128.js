const prompt = require("prompt-sync")({ sigint: true });

var saldoMedio = parseFloat(prompt("Digite o seu saldo médio do último ano:"));
if(saldoMedio < 0){
    console.log("Valor inválido, tente novamente!");
}
else if(saldoMedio >= 0 && saldoMedio <= 500){
    console.log("O seu saldo médio é "+saldoMedio+" e você não possui nenhum crédito.")
}
else if (saldoMedio >= 501 && saldoMedio <= 1000){
    credito = saldoMedio * 30 / 100;
    console.log("O seu saldo médio é "+saldoMedio+" e você possui um crédito de: "+credito);
}
else if (saldoMedio >= 1001 && saldoMedio <= 3000){
    credito = saldoMedio * 40 / 100;
    console.log("O seu saldo médio é "+saldoMedio+" e você possui um crédito de: "+credito);
}
else if(saldoMedio > 3000){
    credito = saldoMedio * 50 / 100;
    console.log("O seu saldo médio é "+saldoMedio+" e você possui um crédito de: "+credito);
}