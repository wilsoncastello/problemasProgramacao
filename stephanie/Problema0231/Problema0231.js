var popA=90000, popB=300000 ;
var i=0;

while (popB > popA){
    i = i + 1;
    popA = popA + popA*3/100;
    popB = popB + popB*1.2/100;
}
console.log("A população da cidade A ultrapassará a população da "+"cidade B daqui a "+i+" anos.");
