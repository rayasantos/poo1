public class Professor {
        private String nome;
        private int idade;
        private String disciplina;
    

        public Professor(String nome, int idade, String disciplina) {
            this.nome = nome;
            this.idade = idade;
            this.disciplina = disciplina;
        }
    

        public void exibirInformacoes() {
            System.out.println("Nome do professor: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Disciplina: " + disciplina);
        }
    }
    
