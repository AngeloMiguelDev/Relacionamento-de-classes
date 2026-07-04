// Classe abstrata 
abstract class Pagamento { 
    abstract void processarPagamento(double valor); 
} 

// Interface
interface Confirmavel { 
    void confirmar(); 
} 

// Subclasse 1 
class PagamentoCartao extends Pagamento implements Confirmavel { 
    @Override 
    void processarPagamento(double valor) { 
        System.out.println("Processando pagamento no cartão: R$" + valor); 
    } 

    @Override 
    public void confirmar() { 
        System.out.println("Pagamento com cartão confirmado."); 
    } 
} 

// Subclasse 2 
class PagamentoBoleto extends Pagamento implements Confirmavel { 
    @Override 
    void processarPagamento(double valor) { 
        System.out.println("Gerando boleto no valor de: R$" + valor); 
    } 

    @Override 
    public void confirmar() { 
        System.out.println("Pagamento por boleto confirmado."); 
    } 
} 

// Classe principal 
public class SistemaPagamento { 
    public static void main(String[] args) { 
        
        // Array de objetos polimórficos 
        Pagamento[] pagamentos = { 
            new PagamentoCartao(), 
            new PagamentoBoleto() 
        }; 

        for (Pagamento p : pagamentos) { 
            p.processarPagamento(100.00); // Polimorfismo com classe abstrata 

            // Polimorfismo com interface 
            if (p instanceof Confirmavel) { 
                ((Confirmavel) p).confirmar(); 
            } 
        } 
    } 
} 