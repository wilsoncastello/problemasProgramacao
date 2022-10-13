const prompt = require("prompt-sync")({ sigint: true });

var rendimento, totalRen = 0;
var totalCri = 0, familias = 0, renMenor1000 = 0;
do{
    rendimento = prompt("Digite o rendimento familiar:");
    criancas = prompt("Digite quantas crianças menores tem na família:");
    totalRen = totalRen + rendimento;
    totalCri = totalCri + criancas;
    familias++;
    if(rendimento<=1000){
        renMenor1000++;
    }
}while(rendimento>0);
var mediaRen = totalRen/familias;
var mediaCria = totalCri/familias;
console.log("Média dos rendimentos da população:"+mediaRen);
console.log("Média do número de filhos:"+mediaCria);
console.log("Percentual de famílias com rendimento igual ou inferior a R$1000:"+renMenor1000+"%");
