package stephanie.Problema0445;

public class Problema0445 {

public static boolean pesoHomem(boolean alt){
        return 72.7 * alt - 58;
}
public static boolean pesoMulher(boolean alt){
        return 62.1 * alt -44.7;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean alt, peso;
    String sexo;
    System.out.print("Digite a altura: ");
    alt = Boolean.valueOf(input.nextLine());
    System.out.print("Digite o sexo: ");
    sexo = input.nextLine();
    if(sexo.equalsIgnoreCase("masculino")){
        peso = pesoHomem(alt);
    } else{
        if(sexo.equalsIgnoreCase("feminino")){
        peso = pesoMulher(alt);
    }
    }
    System.out.print("O peso ideal é "+peso);
}

}