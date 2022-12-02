const prompt = require("prompt-sync")({ sigint: true })

var nomes = [5];
var salario = [5];
var tempo = [5];
for (i=0;i<5;i++) {
    nomes[i] = String(prompt("Digite o nome do funcionário "+i+" :"));
}
for (i=0;i<5;i++) {
    salario[i] = Number(prompt("Digite o salário de "+nomes[i]+" :"));
}
for (i=0;i<5;i++) {
    tempo[i] = Number(prompt("Digite o tempo de serviço de "+nomes[i]+" (Em anos):"));
}
console.log("Funcionários que não tem direito ao aumento: ");
for(i=0;i<5;i++){
    if(tempo[i] < 5 && salario[i] > 800){
        console.log(nomes[i]);
    }
}
console.log("Funcionários que tem direito ao aumento: ");
for(i=0;i<5;i++){         
    if(tempo[i] > 5 && salario[i] < 800){
        salario[i] = salario[i] + salario[i] * 0.35;
        console.log(nomes[i]+" Novo salário: "+salario[i]);
    }
    else if(tempo[i] > 5 && salario[i] > 800){
        salario[i] = salario[i] + salario[i] * 0.25;
        console.log(nomes[i]+" Novo salário: "+salario[i]);
    }
    else if(salario[i] < 800 && tempo[i] < 5){
        salario[i] = salario[i] + salario[i] * 0.15;
        console.log(nomes[i]+" Novo salário: "+salario[i]);
    }
}
