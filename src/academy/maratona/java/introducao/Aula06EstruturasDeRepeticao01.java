package academy.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao01 {
  public static void main(String[] args) {
    // while, dowhile, for
    int count = 0;
    while (count < 10) {
      System.out.println(++count);
    }

    count = 0;
    do {
      System.out.println("Dentro do do-while");
      count++;
    } while (count < 10);
    
    for (int i = 0; i < 10; i++) {
      System.out.println("FOR " +i);
    }
  }
}
