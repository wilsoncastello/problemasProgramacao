
var sb = prompt("Digite o salário base: ")
var idade = prompt("Digite a idade: ")
var tempoServico = prompt("Digite os anos de seviço: ")
var dependentes = prompt("Digite a quantidade de dependentes: ")

if( idade > 50 ){
    sf = sb + ((idade - 50) * (sb / 100 * 1));
    sf = sf + tempoServico * (sb / 100 * 2);
} else {
    sf = sb + tempoServico * (sb / 100 * 2);
}

console.log("Salário final: "+sf);

if( dependentes <= 5 && dependentes != 0){
    sf = (sb / 100 * 4);
    console.log(sf + " para cada dependente.");
} else {
    console.log("Não aplicável.");
}