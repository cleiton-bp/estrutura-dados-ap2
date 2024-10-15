package exerciciodois;

public class Livro {
    private static int contador = 0;
    private int id;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.id = ++contador;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro ID: " + id + ", Título: " + titulo + ", Autor: " + autor;
    }
}
