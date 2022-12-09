var letra = Array(26)
var ASCII = Array(26)

letra[0] = "a"; letra[1] = "b"; letra[2] = "c"; letra[3] = "d"; letra[4] = "e"; letra[5] = "f"; letra[6] = "g"; letra[7] = "h"; letra[8] = "i"; letra[9] = "j"; letra[10] = "k";
letra[11] = "l"; letra[12] = "m"; letra[13] = "n"; letra[14] = "o"; letra[15] = "p"; letra[16] = "q"; letra[17] = "r"; letra[18] = "s"; letra[19] = "t"; letra[20] = "u";
letra[21] = "v"; letra[22] = "w"; letra[23] = "x"; letra[24] = "y"; letra[25] = "z";

var j=0
for(var i=65;i<91;i++){
    ASCII[j] = i + " "
    j++;
}    

var mensagem = prompt("Digite uma mensagem: ");
var novaMensagem = mensagem.toLowerCase();

console.log("Mensagem digitada: "+novaMensagem);

for(var i=0; i<26; i++){
    novaMensagem = novaMensagem.replaceAll(letra[i], ASCII[i])
}

console.log("Mensagem criptografada: "+novaMensagem)

for(var i=0; i<26; i++){
    novaMensagem = novaMensagem.replaceAll(ASCII[i], letra[i])
}

console.log("Mensagem descriptografada: "+novaMensagem)