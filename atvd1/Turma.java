public class Turma {
        private String codigo;
        private Disciplina disciplina;
    
        // Método construtor
        public Turma(String codigo, Disciplina disciplina) {
            this.codigo = codigo;
            this.disciplina = disciplina;
        }
    
        // Método geral para exibir informações
        public void exibirInformacoes() {
            System.out.println("Código da turma: " + codigo);
            System.out.println("Disciplina: ");
            disciplina.exibirInformacoes();
        }
    }
    

