const prompt = require("prompt-sync")({ sigint: true });

var frase,palavra,palavras=[],vezes;
palavra="aula";
vezes=0
frase=(prompt("Digite uma frase que sera detectado o numero de vezes que 'Aula' aparece: "));
frase1=frase.toLowerCase();
 palavras= frase1.split(" ");
for(i=0;i<palavras.length;i++){
    if(palavras[i]==palavra){
        vezes++;
    }
}
console.log("Vezes que 'aula' aparece: "+vezes);
