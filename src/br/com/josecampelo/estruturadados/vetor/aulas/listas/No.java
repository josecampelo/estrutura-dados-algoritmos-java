package br.com.josecampelo.estruturadados.vetor.aulas.listas;

public class No<T> {
    private T elementoNo;
    private No<T> proximoNo;

    public No(T elemento) {
        this.elementoNo = elemento;
        this.proximoNo = null;
    }

    public No(T elemento, No<T> proximo) {
        this.elementoNo = elemento;
        this.proximoNo = proximo;
    }

    public T getElementoNo() {
        return elementoNo;
    }

    public void setElementoNo(T elementoNo) {
        this.elementoNo = elementoNo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "[" + elementoNo + "]";
    }
}