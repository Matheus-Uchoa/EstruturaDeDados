package pilha;

public class mainPilha {
  public static void main(String[] args) {
    PilhaDinamica pilha = new PilhaDinamica(5);
    pilha.empilhar("Joana");
    pilha.empilhar("Jocivan");
    pilha.empilhar("João");
    pilha.empilhar("Joabe");
  
    System.out.println(pilha.imprimir());
    System.out.println(pilha.getTamanho());
    System.out.println(pilha.estaVazia());
    pilha.remover();
    System.out.println(pilha.imprimir());
  }
}
