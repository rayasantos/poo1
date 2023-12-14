public class Escola {

        private String nome;
        private String endereco;
    
        // Método construtor
        public Escola(String nome, String endereco) {
            this.nome = nome;
            this.endereco = endereco;
        }
    
        // Método geral para exibir informações
        public void exibirInformacoes() {
            System.out.println("Nome da escola: " + nome);
            System.out.println("Endereço: " + endereco);
        }
    }
    