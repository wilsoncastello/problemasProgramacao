const prompt = require("prompt-sync")({ sigint: true });
var frase = prompt("Digite uma frase: ");
var v = [...frase];
for (i = 0; i < frase.length; i++) {
  if (v[i] == 'a' || v[i] == 'e' || v[i] == 'i' || v[i] == 'o' || v[i] == 'u') {
    v[i] = v[i].toUpperCase();
  } else {
    v[i] = v[i].toLowerCase();
  }
}
for (i = 0; i < frase.length; i++) {
  process.stdout.write(v[i])
}