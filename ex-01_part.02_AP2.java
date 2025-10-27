public class Main {

    public static void main(String[] args) {
        // 1. Cria um novo objeto da classe Lista
        Lista minhaLista = new Lista();

        // 2. Testa o método mostrar() com a lista ainda vazia
        System.out.println("--- Testando mostrar() com lista vazia ---");
        minhaLista.mostrar();

        // 3. Insere 5 elementos para preencher a lista
        System.out.println("\n--- Inserindo 5 elementos ---");
        minhaLista.inserir(10);
        minhaLista.inserir(20);
        minhaLista.inserir(30);
        minhaLista.inserir(40);
        minhaLista.inserir(50);

        // 4. Mostra a lista cheia
        System.out.println("\n--- Testando mostrar() com lista cheia ---");
        minhaLista.mostrar();

        // 5. Tenta inserir um sexto elemento (deve falhar)
        System.out.println("\n--- Tentando inserir o 6º elemento (deve falhar) ---");
        minhaLista.inserir(60);

        // 6. Mostra a lista novamente para confirmar que o 60 não entrou
        System.out.println("\n--- Mostrando lista final ---");
        minhaLista.mostrar();
    }
}
