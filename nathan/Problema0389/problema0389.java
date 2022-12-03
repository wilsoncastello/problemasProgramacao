package Problema0389;

class problema0389{
    public static void main(String[] args){
        int m[][] = new int[3][3];
         
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {                   
                 System.out.println("Digite o numero na posição ["+i+"]["+j+"]: ");
                 m[i][j] = Integer.valueOf(input.nextLine());
             }
        }
         
        int[][] m270 = new int[3][3];
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j< 3; j++) {
                m270[i][j] = m[j][2 - i];
            }
        }
        
        for (int i = 0; i < m270.length; i++) {
            for (int j = 0; j < m270.length; j++) {
                System.out.print(m270[i][j] + " "); 
            } 
            System.out.println(" ");
        }
    }
}