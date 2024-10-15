package base;

public class NoDuplo<T> {
    public T dado;
    public NoDuplo<T> anterior;
    public NoDuplo<T> proximo;

    public NoDuplo(T dado) {
        this.dado = dado;
        this.anterior = this.proximo = null;
    }
}