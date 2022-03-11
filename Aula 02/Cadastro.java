import java.util.Scanner;

public class Cadastro {
 
    public static void main(String[] args) {
        // Variáveis
        String nome;
        int idade;
        double salario;
        

        // Scanner para realizar leitura a partir do teclado
        Scanner entrada = new Scanner(System.in);
        
        // Ler o nome
        System.out.print("Qual é seu nome: ");
        nome = entrada.nextLine();

        // Ler a idade
        System.out.print(nome + " qual é suua idade? ");
        idade = entrada.nextInt();

        // Ler o salário
        System.out.print(nome + " qual é seu salário? ");
        salario = entrada.nextDouble();

        // Exibir os dados lidos
        System.out.println();
        System.out.println("Dados Cadastraias -----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$ " + salario);
        System.out.println("-----------------------------------");

        entrada.close();
    }
}
