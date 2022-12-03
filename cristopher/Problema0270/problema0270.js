const prompt = require("prompt-sync")({ sigvar: true });

var vetorPrimos = []
var k = 0

for (var i = 100; i < 150; i++) {
    var primo = true;
            
    for(var j = 2; j < i; j++) {
                
        if(i % j == 0) {
            primo = false;
        }
                
    }

    if(primo) {
        vetorPrimos[k] = i;
        k++;
    }
            
    }

    for (var i = 0; i < vetorPrimos.length; i++) {
         console.log("["+i+"]: " + vetorPrimos[i]);
    }
    
