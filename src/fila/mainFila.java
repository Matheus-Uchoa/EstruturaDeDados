package fila;

public class mainFila {
  public static void main(String[] args) {
    FilaDinamica fila = new FilaDinamica();

    fila.adicionar("Joana");
    fila.adicionar("Jocivan");
    fila.adicionar("João");
    fila.adicionar("Joabe");
    fila.adicionar(12.32f);

    System.out.println(fila.getTamanho());
    System.out.println(fila.estaVazia());
    System.out.println(fila.imprimir());
    fila.remover();
    System.out.println(fila.getTamanho());

  }
}
