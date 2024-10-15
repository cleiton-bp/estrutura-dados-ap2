package exerciciodois;

import base.NoDuplo;

public class ListaDuplamenteLigada<T> {
    private NoDuplo<T> inicio;
    private NoDuplo<T> fim;

    public ListaDuplamenteLigada() {
        this.inicio = this.fim = null;
    }

    public void adicionaFim(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<>(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void adicionaInicio(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }


    public T removerInicio() {
        if (inicio == null) {
            return null;
        }
        T dado = inicio.dado;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        return dado;
    }

    public T removerFim() {
        if (fim == null) {
            return null;
        }
        T dado = fim.dado;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        return dado;
    }

    public void imprimirLista() {
        NoDuplo<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirListaReversa() {
        NoDuplo<T> atual = fim;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public T buscarPorId(int id) {
        NoDuplo<T> atual = inicio;
        int contador = 0;
        while (atual != null) {
            if (contador == id) {
                return atual.dado;
            }
            atual = atual.proximo;
            contador++;
        }
        return null;
    }
}
