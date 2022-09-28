const prompt = require("prompt-sync")({ sigint: true });

var preco = prompt("Digite o preço do produto: ");
var codigo = prompt("Digite o código de origem do produto: ");

if(codigo==1){
    console.log("Procedência do produto: Sul");
}else if(codigo==2){
    console.log("Procedência do produto: Norte");
}else if(codigo==3){
    console.log("Procedência do produto: Leste");
}else if(codigo==4){
    console.log("Procedência do produto: Oeste");
}else if(codigo==5||codigo==6){
    console.log("Procedência do produto: Nordeste");
}else if(codigo==7||codigo==8||codigo==9){
    console.log("Procedência do produto: Sudeste");
}else if(codigo<=10&&codigo<=20){
    console.log("Procedência do produto: Centro-Oeste");
}else if(codigo<=21&&codigo>=30){
    console.log("Procedência do produto: Nordeste");
}