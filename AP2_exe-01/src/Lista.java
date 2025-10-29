/**
 * Classe Lista que armazena até 5 números inteiros em um vetor.
 */
public class Lista {

    // 1. O vetor de inteiros para armazenar os elementos
    int[] vetor;

    // 2. Um contador para saber quantos elementos já foram inseridos
    int tamanhoAtual;

    // 3. Uma constante para definir o tamanho máximo
    static final int CAPACIDADE_MAXIMA = 5;

    /**
     * Construtor da classe.
     * Inicializa o vetor com a capacidade máxima e zera o contador.
     */
    public Lista() {
        this.vetor = new int[CAPACIDADE_MAXIMA];
        this.tamanhoAtual = 0; // A lista começa vazia
    }

    /**
     * Insere um novo valor na lista, se houver espaço.
     * @param valor O número inteiro a ser inserido.
     */
    public void inserir(int valor) {
        // Verifica se a lista (vetor) já está cheia
        if (this.tamanhoAtual < CAPACIDADE_MAXIMA) {
            // Se não estiver cheia, adiciona o valor na próxima posição livre
            this.vetor[this.tamanhoAtual] = valor;

            // Incrementa o contador de elementos
            this.tamanhoAtual++;

            System.out.println("Valor " + valor + " inserido com sucesso.");
        } else {
            // Se estiver cheia, avisa o usuário
            System.out.println("Erro: A lista está cheia! Não foi possível inserir o valor " + valor + ".");
        }
    }

    /**
     * Mostra todos os elementos atualmente armazenados na lista.
     */
    public void mostrar() {
        // Verifica se a lista está vazia
        if (this.tamanhoAtual == 0) {
            System.out.println("A lista está vazia.");
            return; // Encerra o método aqui
        }

        System.out.println("--- Elementos da Lista ---");
        // Itera apenas até a quantidade de elementos inseridos (tamanhoAtual)
        for (int i = 0; i < this.tamanhoAtual; i++) {
            System.out.println("Posição " + i + ": " + this.vetor[i]);
        }
        System.out.println("---------------------------");
    }
}