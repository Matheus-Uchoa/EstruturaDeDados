package fila;

public class FilaDinamica<T> {
  private int quantidade;
  private int tamanho;
  private No<T> ponteiroInicio;
  private No<T> ponteiroFim;

  public FilaDinamica() {
    this(10);
  }

  public FilaDinamica(int tamanho) {
    quantidade = 0;
    this.tamanho = tamanho;
    ponteiroInicio = null;
    ponteiroFim = null;
  }

  public void adicionar(T dado) {
    if (!estaCheia()) {
      No<T> noTemporario = new No<>();
      noTemporario.setDado(dado);
      if (!estaVazia()) {
        ponteiroFim.setProximo(noTemporario);
      } else {
        ponteiroInicio = noTemporario;
      }
      noTemporario.setAnterior(ponteiroFim);
      ponteiroFim = noTemporario;
      quantidade++;
    } else {
      System.out.println("Fila Cheia");
    }
  }

  public T remover() {
    T elementoInicio = null;
    if (!estaVazia()) {
      elementoInicio = ponteiroInicio.getDado();
      ponteiroInicio = ponteiroInicio.getProximo();
      if (quantidade > 1) {
        ponteiroInicio.setAnterior(null);
      }
      quantidade--;
    } else {
      System.out.println("Fila Vazia!");
    }
    return elementoInicio;
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public boolean estaCheia() {
    return (quantidade == tamanho);
  }

  public boolean estaVazia() {
    return (quantidade == 0);
  }

  public String imprimir() {
    No<T> noAux = ponteiroInicio;
    String resultado = "[";
    for (int i = 0; i < quantidade; i++) {
      if (i == quantidade - 1) {
        resultado += noAux.getDado();
      } else {
        resultado += noAux.getDado() + ",";
      }
      noAux = noAux.getProximo();
    }
    return resultado + "]";
  }
}
