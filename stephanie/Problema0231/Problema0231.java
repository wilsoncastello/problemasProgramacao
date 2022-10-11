package stephanie.Problema0231;

public class Problema0231 {
    public static void main(String[] args) {
        double popA=90000, popB=300000 ;
        int i=0;
       
        while (popB > popA){
           i = i + 1;
           popA = popA + popA*3/100;
           popB = popB + popB*1.2/100;
        }
        System.out.println("A população da cidade A ultrapassará a população da "+"cidade B daqui a "+i+" anos.");
    }   

}
