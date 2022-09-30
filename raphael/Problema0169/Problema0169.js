const prompt = require("prompt-sync")({ sigint: true });

mediaA = 0;
mediaB = 0;
mediaC = 0;
mediaD = 0;

contA = 0;
contB = 0;
contC = 0;
contD = 0;

for (var i=0;i<15;i++) {
    idade = Number(prompt("Digite a idade da "+(i+1)+" pessoa: "));

    peso = Number(prompt("Digite o peso da "+(i+1)+" pessoa: "));

    if (idade > 0 && idade < 11) {
        mediaA = mediaA + peso;
        contA++;

    } else if (idade > 10 && idade < 21) {
        mediaB = mediaB + peso;
        contB++;

    } else if (idade > 20 && idade < 31) {
        mediaC = mediaC + peso;
        contC++;

    } else {
        mediaD = mediaD + peso;
        contD++;
    }
}

Ra = mediaA / contA;
Rb = mediaB / contB;
Rc = mediaC / contC;
Rd = mediaD / contD;

console.log("Peso médio das pessoa de 1 a 10 anos: "+Ra+"\n \n Peso médio das pessoas de 11 a 20 anos: "+Rb+"\n \n Peso médio das pessoas de 21 a 30 anos: "+Rc+"\n \n Peso médio das pessoas com mais de 30 anos: "+Rd);