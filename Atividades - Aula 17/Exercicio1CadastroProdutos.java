import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
    
    // Método adicionado para o Exercício 2 funcionar
    public String getNome() {
        return nome;
    }

    // Método adicionado para o Exercício 3 funcionar
    public double getPreco() {
        return preco;
    }
}

public class Exercicio1CadastroProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            
            produtos.add(new Produto(nome, preco));
        }

        System.out.println("\nProdutos cadastrados:");
        for (Produto p : produtos) {
            p.exibir();
        }
        scanner.close();
    }
}