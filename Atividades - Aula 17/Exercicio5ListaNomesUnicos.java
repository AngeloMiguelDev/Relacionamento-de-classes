import java.util.HashSet;
import java.util.Scanner;

public class Exercicio5ListaNomesUnicos {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes (digite 'fim' para parar):");

        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) break;
            
            nomes.add(nome);
        }

        System.out.println("\nNomes únicos:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        scanner.close();
    }
}