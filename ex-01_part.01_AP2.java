public class Lista {

    int[] vetor;
    int tamanhoAtual;
    static final int CAPACIDADE_MAXIMA = 5;

    public Lista() {
        this.vetor = new int[CAPACIDADE_MAXIMA];
        this.tamanhoAtual = 0; // A lista começa vazia
    }

    public void inserir(int valor) {
        if (this.tamanhoAtual < CAPACIDADE_MAXIMA) {
            this.vetor[this.tamanhoAtual] = valor;

            this.tamanhoAtual++;

            System.out.println("Valor " + valor + " inserido com sucesso.");
        } else {
            System.out.println("Erro: A lista está cheia! Não foi possível inserir o valor " + valor + ".");
        }
    }

    public void mostrar() {
        if (this.tamanhoAtual == 0) {
            System.out.println("A lista está vazia.");
            return; // Encerra o método aqui
        }

        System.out.println("--- Elementos da Lista ---");
        for (int i = 0; i < this.tamanhoAtual; i++) {
            System.out.println("Posição " + i + ": " + this.vetor[i]);
        }
        System.out.println("---------------------------");
    }
}
