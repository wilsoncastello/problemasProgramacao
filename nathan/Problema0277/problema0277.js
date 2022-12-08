const prompt = require("prompt-sync")({ sigint: true });
var vNome = [5];
var vPreco = [5];
var contPreco50= 0, contPreco100 = 0, somaPreco100 = 0;

for (i = 0; i < 5; i++) {
    vNome[i] = Number(prompt("Digite o nome do " + (i+1) + "° produto: "));
    vPreco[i] = prompt("Digite seu preço: ");
}
for (i = 0; i < 5; i++) {
    if(vPreco[i] < 50){
        contPreco50++;
    }
    if(vPreco[i] > 100){
        somaPreco100 = somaPreco100 + vPreco[i];
        contPreco100++;
    }
}
console.log("Produtos com preço entre 50R$ e 100R$: ");
for (i = 0; i < 5; i++) {
    if(vPreco[i] >= 50 && vPreco[i] <= 100){
        console.log(vNome[i]);
    }
}
console.log("\nQuantidade de produtos com preço inferior a 50R$: " + contPreco50);
console.log("Media dos preços dos produtos com preço superior a 100R$: " + (somaPreco100 / contPreco100));
