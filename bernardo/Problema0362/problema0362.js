const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var menor_notas = [0, 0, 0];
var menor_provas = [10, 10, 10];
var provas_quantidade = [0, 0, 0];
var notas = [[0, 0, 0], [0, 0, 0], [0, 0, 0]];
var provas = 3;
var alunos = 3;

for (var i = 0; i < alunos; i++) {
    verificacao = 10;
    for (var j = 0; j < provas; j++) {
        notas[i][j] = (
            parseFloat(prompt("Digite a " + (j + 1) + " nota do " + (i + 1) + " aluno: ")));
        if (notas[i][j] <= verificacao) {
            verificacao = notas[i][j];
            menor_notas[i] = j + 1;
        }
        if (menor_provas[j] >= notas[i][j]) {
            menor_provas[j] = notas[i][j];
        }
    }
}


// Cálculo da quantidade de menores notas
for (var i = 0; i < provas; i++) {
    for (var j = 0; j < alunos; j++) {
        if (notas[j][i] == menor_provas[i]) {
            provas_quantidade[i] += 1;
        }
    }
}

// Saída
console.log("---Relatório---");
for (var i = 0; i < alunos; i++) {
    console.log("A menor nota do " + (i + 1) + " aluno foi na prova " + menor_notas[i]);
}
for (var i = 0; i < provas; i++) {
    console.log("A quantdiade de alunos que tiraram a menor nota na prova " + (i + 1) + " foi " + provas_quantidade[i]);
}
