const prompt = require("prompt-sync")({ sigint: true });

var nota=[],tipo=[],resultado=[];

function Media(nota,tipo,resultado){
    
    if(tipo[0].endsWith("P") || tipo[0].endsWith("p")){
    nota[0]=nota[0]*5;
    nota[1]=nota[1]*3;
    nota[2]=nota[2]*2;
    resultado[0]=(nota[0]+nota[1]+nota[2])/10;
}
    else{

        resultado[0]=(nota[0]+nota[1]+nota[2])/3;
    }
}


function Main(){
console.log("Digite 3 numeros: ");
for(i=0;i<3;i++){
nota[i]=Number(prompt(""));}
tipo[0]=prompt("Digite 'A' para media aritmetica ou 'P' para media ponderada: ");



Media(nota,tipo,resultado);
console.log("Resultado: "+resultado[0]);

}

Main();