
    public class lanche {
        private String nome;
        private String descricao;
        private double valor;
        private int estoque;
        private boolean disponivel;


        public lanche(String nome, String descricao, double valor, int estoque) {
            this.nome = nome;
            this.descricao = descricao;
            this.valor = valor;
            this.estoque = estoque;
            this.disponivel = estoque > 1;
        }

        @Override
        public String toString() {
            return "lanche{" +
                    "nome='" + nome + '\'' +
                    ",\ndescricao='" + descricao + '\'' +
                    ",\nvalor=" + valor +
                    ",\nestoque=" + estoque +
                    ",\ndisponivel=" + disponivel +
                    '}';
        }

        public String getNome() {
            return nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public double getValor() {
            return valor;
        }

        public int getEstoque() {
            return estoque;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
