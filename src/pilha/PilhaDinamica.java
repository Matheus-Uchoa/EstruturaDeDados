package pilha;

public class PilhaDinamica<T> {
  private No<T> topo;
  private int quantidade;
  private int tamanho;

  public PilhaDinamica() {
    this(10);
  }

  public PilhaDinamica(int tamanho) {
    this.tamanho = tamanho;
    quantidade = 0;
    topo = null;
  }

	public void empilhar(T dado) {
		if (!estaCheia()) {
			No<T> noTemporario = new No<T>();
			noTemporario.setDado(dado);
			noTemporario.setAnterior(topo);
			if (!estaVazia()) {
				topo.setProximo(noTemporario);
			}
			topo = noTemporario;
			quantidade++;
		} else {
			System.err.println("Pilha Cheia!");
		}
	}

  public T remover() {
    T elementoTopo = null;
    if (!estaVazia()) {
      elementoTopo = topo.getDado();
      topo = topo.getAnterior();
      if (quantidade > 1) {
        topo.setProximo(null);
        quantidade--;
      }

    } else {
      System.out.println("Pilha Vazia!");
    }
    return elementoTopo;
  }

  public T topo() {
    T elementoTopo = null;
    if (!estaVazia()) {
      elementoTopo = topo.getDado();
    } else {
      System.out.println("Pilha Vazia");
    }
    return elementoTopo;
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
    No<T> ponteiroAux = topo;
    String resultado = "[";
    for (int i = quantidade - 1; i >= 0; i--) {
      if (i == 0) {
        resultado += ponteiroAux.getDado();
      } else {
        resultado += ponteiroAux.getDado() + ", ";
      }
      ponteiroAux = ponteiroAux.getAnterior();
    }
    return resultado + "]";
  }

}
