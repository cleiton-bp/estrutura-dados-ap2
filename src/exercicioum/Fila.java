package exercicioum;

import base.No;

public class Fila<T> {
    private No<T> frente;
    private No<T> tras;

    public Fila() {
        this.frente = this.tras = null;
    }

    public void enfileirar(T dado) {
        No<T> novoNo = new No<>(dado);
        if (tras == null) {
            frente = tras = novoNo;
            return;
        }
        tras.setProximo(novoNo);
        tras = novoNo;
    }

    public T desenfileirar() {
        if (frente == null) {
            return null;
        }
        T dado = frente.getDado();
        frente = frente.getProximo();
        if (frente == null) {
            tras = null;
        }
        return dado;
    }

    public void imprimirFila() {
        No<T> atual = frente;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
