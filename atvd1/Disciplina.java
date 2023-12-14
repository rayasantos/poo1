public class Disciplina {
        private String nome;
        private int cargaHoraria;
    
        // Método construtor
        public Disciplina(String nome, int cargaHoraria) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }
    
        // Método geral para exibir informações
        public void exibirInformacoes() {
            System.out.println("Nome da disciplina: " + nome);
            System.out.println("Carga horária: " + cargaHoraria + " horas");
        }
    }
    

