import java.util.HashMap;
import java.util.Scanner;

public class Exercicio4ContadorPalavras {
    public static void main(String[] args) {
        HashMap<String, Integer> contagem = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite palavras (digite 'fim' para parar):");

        while (true) {
            String palavra = scanner.next();
            if (palavra.equalsIgnoreCase("fim")) break;
            
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("\nFrequência das palavras:");
        for (var entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        scanner.close();
    }
}