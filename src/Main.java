import exercicioum.Fila;
import exercicioum.Pedido;
import exercicioum.Pilha;
import exerciciodois.Livro;
import exerciciodois.ListaDuplamenteLigada;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------- Exercicio 1 --------------");
        Fila<Pedido> filaPedidos = new Fila<>();
        Pilha<Pedido> pilhaCancelados = new Pilha<>();

        filaPedidos.enfileirar(new Pedido("Café"));
        filaPedidos.enfileirar(new Pedido("Capuccino"));
        filaPedidos.enfileirar(new Pedido("Expresso"));

        System.out.println("Pedidos Pendentes:");
        filaPedidos.imprimirFila();

        System.out.println("\nAtendendo Pedido:");
        System.out.println(filaPedidos.desenfileirar());

        System.out.println("\nPedidos Pendentes:");
        filaPedidos.imprimirFila();

        System.out.println("\nCancelando Pedido:");
        Pedido pedidoCancelado = filaPedidos.desenfileirar();
        pilhaCancelados.empilhar(pedidoCancelado);
        System.out.println(pedidoCancelado);

        System.out.println("\nPedidos Pendentes:");
        filaPedidos.imprimirFila();

        System.out.println("\nPedidos Cancelados:");
        pilhaCancelados.imprimirPilha();

        System.out.println("\nRestaurando Pedido:");
        Pedido pedidoRestaurado = pilhaCancelados.desempilhar();
        filaPedidos.enfileirar(pedidoRestaurado);
        System.out.println(pedidoRestaurado);

        System.out.println("\nPedidos Pendentes:");
        filaPedidos.imprimirFila();

        System.out.println("\nPedidos Cancelados:");
        pilhaCancelados.imprimirPilha();


        System.out.println("------------- Exercicio 2 --------------");
        ListaDuplamenteLigada<Livro> lista = new ListaDuplamenteLigada<>();

        lista.adicionaInicio(new Livro("Desencolvimento de Sistemas Moveis 1", "Teste 1"));
        lista.adicionaFim(new Livro("POO 2", "Teste 2"));
        lista.adicionaInicio(new Livro("Estrutura Dados 3", "Teste 3"));
        lista.adicionaInicio(new Livro("Aleatorio 4", "Teste 4"));

        System.out.println("Lista na ordem original:");
        lista.imprimirLista();

        System.out.println("\nLista na ordem reversa:");
        lista.imprimirListaReversa();

        System.out.println("\nRemovendo o primeiro livro:");
        System.out.println(lista.removerInicio());

        System.out.println("\nRemovendo o último livro:");
        System.out.println(lista.removerFim());

        System.out.println("\nBuscando livro com ID 2:");
        System.out.println(lista.buscarPorId(1));
    }
}
