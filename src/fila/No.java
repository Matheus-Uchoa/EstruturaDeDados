package fila;

public class No<T> {
  private No<T> proximo; // Referencia para o próximo
  private No<T> anterior;
  private T dado;

  public No<T> getProximo() {
    return proximo;
  }

  public void setProximo(No<T> proximo) {
    this.proximo = proximo;
  }

  public No<T> getAnterior() {
    return anterior;
  }

  public void setAnterior(No<T> anterior) {
    this.anterior = anterior;
  }

  public T getDado() {
    return dado;
  }

  public void setDado(T dado) {
    this.dado = dado;
  }

}
