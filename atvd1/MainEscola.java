public class MainEscola {
    public static void main(String[] args) {
        // Criando objetos
        Aluno aluno1 = new Aluno("Maria", 16, "A123");
        Aluno aluno2 = new Aluno("João", 15, "B456");

        Professor professor1 = new Professor("Carlos", 35, "Matemática");
        Professor professor2 = new Professor("Ana", 40, "Português");

        Disciplina disciplina1 = new Disciplina("Matemática", 60);
        Disciplina disciplina2 = new Disciplina("Português", 45);

        Turma turma1 = new Turma("T1", disciplina1);
        Turma turma2 = new Turma("T2", disciplina2);

        Escola escola = new Escola("Escola ABC", "Rua XYZ");

        // Exibindo informações antes das alterações
        System.out.println("Informações antes das alterações:\n");

        aluno1.exibirInformacoes();
        System.out.println();

        professor1.exibirInformacoes();
        System.out.println();

        disciplina1.exibirInformacoes();
        System.out.println();

        turma1.exibirInformacoes();
        System.out.println();

        escola.exibirInformacoes();
        System.out.println();

        // Alterando valores dos objetos
        aluno1 = new Aluno("Maria Silva", 17, "A124");
        disciplina1 = new Disciplina("Matemática Avançada", 75);
        escola = new Escola("Escola XYZ", "Avenida ABC");

        // Exibindo informações depois das alterações
        System.out.println("\nInformações depois das alterações:\n");

        aluno1.exibirInformacoes();
        System.out.println();

        disciplina1.exibirInformacoes();
        System.out.println();

        escola.exibirInformacoes();
    }
}
