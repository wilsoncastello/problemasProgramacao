const prompt = require("prompt-sync")({ sigint: true });

/* "Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas no seu quadro de funcionários. Supondo que você seja o programador dessa empresa, crie um algoritmo que leia para cada candidato a idade, o sexo (M ou F) e a experiência no serviço (S ou N). 
    Para encerrar a entrada de dados, digite zero para a idade. Calcule e escreva: 
    - o número de candidatos do sexo feminino; 
    - o número de candidatos do sexo masculino; 
    - a idade média dos homens que já têm experiência no serviço; 
    - a porcentagem dos homens com mais de 45 anos entre o total dos homens; 
    - o número de mulheres com idade inferior a 35 anos e com experiência no serviço; 
    - a menor idade entre as mulheres que já têm experiência no serviço." */

var idade=1, contSexF = 0, contSexM = 0, mulherMenos35ComExp = 0, homemMais45 = 0, menorIdadeFComExp = 100, cont1 = 0, somadorIdade = 0;

while (idade != 0) {

    idade = Number(prompt("Digite a idade do candidato (Digite \"0\" para encerrar o programa): "));

    sexo = String(prompt("Digite o sexo do candidato (M ou F): "));

    exp = String(prompt("Digite se tem experiencia profissional(S ou N): "));

    if (sexo == 'F') {
        contSexF++;

        if (idade < 35 && exp == 'S') {
            mulherMenos35ComExp++;
        }

        if (idade < menorIdadeFComExp) {
            menorIdadeFComExp = idade;
        }
    }
    else {
        if (sexo == 'M') {
            contSexM++;

            if (exp == 'S') {
                cont1++;
                somadorIdade = somadorIdade + idade;
            }

            if (idade > 45) {
                homemMais45++;
            }
        }
    }

    if (homemMais45 == 0) {
        porc = 0;
    }
    else {
        porc = (homemMais45 * 100) / contSexM;
    }

}

console.log("\n São candidatos do sexo feminino: "+contSexF+"\n \n São candidatos do sexo masculino: "+contSexM+" \n \n A porcentagem de homens com mais de 45 anos é: "+porc+"% \n \n Mulheres com idade inferior a 35 anos e com experiência de serviço: "+mulherMenos35ComExp+" \n \n A mulher com menos idade, entre as que tem experiência tem: "+menorIdadeFComExp+" anos");