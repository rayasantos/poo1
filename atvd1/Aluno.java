public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Matrícula: " + matricula);
    }
}
