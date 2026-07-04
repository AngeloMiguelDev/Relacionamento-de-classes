import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2RemoverProduto {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto("Notebook", 3500));
        produtos.add(new Produto("Mouse", 150));
        produtos.add(new Produto("Teclado", 200));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto a ser removido: ");
        String nomeRemover = scanner.nextLine();

        produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nomeRemover));

        System.out.println("\nProdutos restantes:");
        for (Produto p : produtos) {
            p.exibir();
        }
        scanner.close();
    }
}