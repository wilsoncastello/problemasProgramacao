import java.util.Scanner;
public class problema0118 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("escreve a sigla do estado: ");
        String sigla = input.nextLine();

        switch (sigla){
            case "AC": System.out.println("Você é do Acre");
                break;
            case "AL": System.out.println("Você é de Alagoas");
                break;
            case "AP": System.out.println("Você é do Amapa");
                break;
            case "AM": System.out.println("Você é do Amazonas");
                break;
            case "BA": System.out.println("Você é baiano");
                break;
            case "CE": System.out.println("Você é do Ceara");
                break;
            case "DF": System.out.println("Você é do Distrito Federal");
                break;
            case "ES": System.out.println("Você é do Espirito Santo");
                break;
            case "GO": System.out.println("Você é de Goias");
                break;
            case "MA": System.out.println("Você é do Maranhao");
                break;
            case "MT": System.out.println("Você é do Mato Grosso");
                break;
            case "MS": System.out.println("Você é do Mato Grosso do Sul");
                break;
            case "MG": System.out.println("Você é mineiro");
                break;
            case "PA": System.out.println("Você é do Para");
                break;
            case "PB": System.out.println("Você é de Paraiba");
                break;
            case "PR": System.out.println("Você é do Parana");
                break;
            case "PE": System.out.println("Você é do Pernambuco");
                break;
            case "PI": System.out.println("Você é do Piaui");
                break;
            case "RJ": System.out.println("Você é carioca");
                break;
            case "RN": System.out.println("Você é do Rio Grande do Norte");
                break;
            case "RS": System.out.println("Você é do Rio Grande do Sul");
                break;
            case "RO": System.out.println("Você é de Rondonia");
                break;
            case "RR": System.out.println("Você é de Roraima");
                break;
            case "SC": System.out.println("Você é catarinense");
                break;
            case "SP": System.out.println("Você é paulista");
                break;
            case "SE": System.out.println("Você é do Sergipe");
                break;
            case "TO": System.out.println("Você é do Tocantins");
                break;   
        }
    

    }
}