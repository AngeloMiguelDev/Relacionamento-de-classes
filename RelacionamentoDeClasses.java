import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    Lousa lousa = new Lousa(); 
}

class Lousa{ 
    // Só existe em sala de aula
}

public class RelacionamentoDeClasses{
    public static void main(String[] args) {

        // ---- Associação ----
        Aluno a1 = new Aluno("Ângelo Miguel ");
        Professor p1 = new Professor(" Pedro Victor");
        a1.conversar(p1);

        // ---- Agregação ----
        Escola e1 = new Escola("IFRN-SGA", Arrays.asList(a1));
        e1.listarAlunos();

    }


}