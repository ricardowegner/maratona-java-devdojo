package academy.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao02 {
  public static void main(String[] args) {
    // Imprima todos os números de 0 até 1000000
    int count = 0;
    while (count < 1000000) {
      System.out.println("Contagem: " + ++count);
    }
    // ou
    for (int i = 0; i < 1000000; i++) {
      if (i % 2 == 0) {
        System.out.println("Contagem: " + ++i);
      }

    }
  }
}
