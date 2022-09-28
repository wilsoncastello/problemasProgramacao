const prompt = require("prompt-sync")({ sigint: true })

for(var i = 1; i <= 10; i++){
    console.log("\nTabuada do " + i)
    for(var j = 1; j <= 10; j++){
        var x = j * i
        console.log(i +" x " + j + " = " + x)
    }
}