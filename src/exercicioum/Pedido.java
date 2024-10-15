package exercicioum;

public class Pedido {
    private static int contador = 0;
    private int id;
    private String descricao;

    public Pedido(String descricao) {
        this.id = ++contador;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + ", Descrição: " + descricao;
    }
}
