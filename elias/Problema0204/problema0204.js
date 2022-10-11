const prompt = require("prompt-sync")({ sigint: true });
for(var i = 0; i < 10; i++){
    var nome = prompt("Digite seu nome:");
    var salarioBruto = parseFloat(prompt("Digite seu salário bruto:"));
    if (salarioBruto < 600){
        console.log(nome+" você é isento da alíquota do imposto de renda");
    }
    else if(salarioBruto >= 600 && salarioBruto < 1500){
        valorAliquota = salarioBruto * 0.1;
        console.log(nome+" o valor da alíquota do seu imposto de renda é:"+valorAliquota);
    }
    else {
        valorAliquota = salarioBruto * 0.15;
        console.log(nome+" o valor da alíquota do seu imposto de renda é:"+valorAliquota);
    }
} 