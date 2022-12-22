var frase = prompt("Digite uma frase")
var fraseLower = frase.toLowerCase();

if(fraseLower.indexOf("de janeiro") > -1){
    
    console.log(fraseLower.replace("de janeiro", "1"));
}

else if(fraseLower.indexOf("de fevereiro") > -1){
    console.log(frase.replace("de fevereiro", "2"));
}

else if(fraseLower.indexOf("de marco") > -1){
    console.log(frase.replace("de marco", "3"));
}

else if(fraseLower.indexOf("de abril") > -1){
    console.log(frase.replace("de abril", "4"));
}

else if(fraseLower.indexOf("de maio") > -1){
    console.log(frase.replace("de maio", "5"));
}

else if(fraseLower.indexOf("de junho") > -1){
    console.log(frase.replace("de junho", "6"));
}

else if(fraseLower.indexOf("de julho") > -1){
    console.log(frase.replace("de julho", "7"));
}

else if(fraseLower.indexOf("de agosto") > -1){
    console.log(frase.replace("de agosto", "8"));
}

else if(fraseLower.indexOf("de setembro") > -1){
    console.log(frase.replace("de setembro", "9"));
}

else if(fraseLower.indexOf("de outubro") > -1){
    console.log(frase.replace("de outubro", "10"));
}

else if(fraseLower.indexOf("de novembro") > -1){
    console.log(frase.replace("de novembro", "11"));
}

else if(fraseLower.indexOf("de dezembro") > -1){
    console.log(frase.replace("de dezembro", "12"));
}

else{
    console.log(frase);
}