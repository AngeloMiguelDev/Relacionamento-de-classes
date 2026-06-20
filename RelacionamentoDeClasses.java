import java.util.Arrays;
import java.util.List;

// ---- Associação ----
class Aluno{
    String nome;

    void conversar(Professor prof){
        System.out.println(this.nome + "conversa com o professor" + prof.nome);
    }

    Aluno(String nome){
        this.nome = nome;
    }
}

class Professor {
    String nome;
    Professor(String nome){
        this.nome = nome;
}
}

// ---- Agregação ----
class Escola{
    String nome;
    List<Aluno> alunos;
    Escola(String nome, List<Aluno> alunos){
        this.nome = nome;
        this.alunos = alunos;
    }

    void listarAlunos(List<Aluno> alunos){
        System.out.println("Alunos da escola " + nome + ":");
        for (Aluno a : alunos){
            System.out.println("- " + a.nome);
        }
    }
}

// ---- Composição ----
class SalaDeAula{
    private Lousa lousa = new Lousa(); 
    void iniciarAula(){
        lousa.escrever("Bem-vindos à aula de POO!");
    }
}

class Lousa{ 
    void escrever(String texto){
        System.out.println("Escrevendo na lousa :" + texto);
    }// Só existe em sala de aula
}

// ---- Coesão e acoplamento ----


class CalculadoraDeNotas {
    //Alta coesão porque opera somente com notas
    double calcularMedia(double n1, double n2){
        return ((n1 + n2)/2);
    }

    boolean passou(double media) {
        return media >= 7.0;
    }
}

class Avaliacao {
    private CalculadoraDeNotas calculadora;

    Avaliacao(CalculadoraDeNotas calculadora){
        this.calculadora = calculadora;
    }

    void avaliar(String aluno, double nota1, double nota2){
        double media = calculadora.calcularMedia(nota1, nota2);
        System.out.println(aluno + " teve média : " + media);
        System.out.println(calculadora.passou(media) ? "Aprovado" : "Reprovado");
    }
}

public class RelacionamentoDeClasses{
    public static void main(String[] args) {

        // ---- Associação ----
        Aluno a1 = new Aluno("Ângelo Miguel ");
        Aluno a2 = new Aluno("David Kauã ");
        Professor p1 = new Professor(" Pedro Victor");
        a1.conversar(p1);

        // ---- Agregação ----
        Escola e1 = new Escola("IFRN-SGA", Arrays.asList(a1,a2));
        e1.listarAlunos(Arrays.asList(a1, a2));

        // ---- Composição ----
        SalaDeAula s1 = new SalaDeAula();
        s1.iniciarAula();

        // ---- Coesão e acoplamento ----
        CalculadoraDeNotas calc = new CalculadoraDeNotas();
        Avaliacao avaliacao = new Avaliacao(calc);
        avaliacao.avaliar("Ângelo", 9.0, 9.0);
        
    }


}