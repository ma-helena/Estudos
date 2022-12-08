package curso.net.classes;
//aplicando o conceito de Hash Code e Equals
//Usado para diferenciar objetos
public class StudyHashandEquals {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Helena");
        aluno1.setNumeroCpf("1234");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Helena");
        aluno2.setNumeroCpf("1234");
        if (aluno1.equals(aluno2)){
            System.out.println("Alunos são iguais");
        }else {
            System.out.println("Alunos não são iguais");
        }



    }
}
