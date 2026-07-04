import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio3OrdenarProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto("Notebook", 3500));
        produtos.add(new Produto("Mouse", 150));
        produtos.add(new Produto("Teclado", 200));

        produtos.sort(Comparator.comparingDouble(Produto::getPreco));

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto p : produtos) {
            p.exibir();
        }
    }
}