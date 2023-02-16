const prompt = require("prompt-sync")({ sigint: true });

var palavra;

palavra=(prompt("Digite uma palavra: "))

for(i=0;i<5;i++){
            
    for(j=5-i;j>1;j--){
        process.stdout.write("   ");
    }
    for (j=0; j<=i; j++ )
    {
        
        process.stdout.write("  "+palavra);
    }
    console.log();
}