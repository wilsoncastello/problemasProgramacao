const prompt = require("prompt-sync")({ sigint: true });

// Função de alteração da string
function alteraString(mensagem, tamanho, caractere) {
    numero = 0;
    lista = mensagem.split('');
    for (var i = 0; i < tamanho; i++) {
        if (lista[i] == caractere) {
            lista[i] = '*';
            numero += 1;
        }
    }
    mensagem = lista.join("");
    console.log("Mensagem alterada: " + mensagem);
    return numero;
}

// Entrada de valores
mensagem = prompt(("Digite a mensagem: "));
tamanho = parseInt(prompt(("Digite o tamanho: ")));
caractere = prompt(("Digite o caractere que deseja ser alterado: "));

// Saída e chamada de função
numero = alteraString(mensagem, tamanho, caractere);
console.log("Númerod de caracteres alterados: " + numero);