import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        
        //Lê a partir da linha de comando
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Entrada: ");
    String texto = sc1.nextLine();

    System.out.println(">>" + texto);
    sc1.close();
    }
}