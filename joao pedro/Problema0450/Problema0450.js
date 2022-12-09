const prompt = require("prompt-sync")({ sigint: true });

function funcao(x1, x2, simbolo) {
    if (simbolo == ("+")) {
        return x1 + x2

    } else {
        if (simbolo == ("-")) {
            return x1 - x2
        } else {
            if (simbolo == ("*")) {
                return x1 * x2
            }
            if (simbolo == ("/")) {
                return x1 / x2

            } else {
                return 0
            }
        }
    }

}



function main() {
    var simbolo = "", x1, x2
    while (simbolo != "#") {
        console.log("Digite dois numeros: ")
        x1 = Number(prompt(""))
        x2 = Number(prompt(""))
        simbolo = prompt("Digite '+' para somar, '-' para subtrair, '*' para multiplicar, '/' para dividir ou '#' para finalizar o processo: ")
        funcao(x1, x2, simbolo)
        if (simbolo != "#") {
            console.log("Resultado: " + funcao(x1, x2, simbolo))
        } else {

            console.log("--Finalizando programa--")
        }
    }




}

main()