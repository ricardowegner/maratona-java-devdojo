package academy.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 25;
        for (int i = 0; i <= valorMax; ++i) {
            if (i > valorMax) {
                break;
            }
            System.out.println("Contagem: " + i);
        }
    }
}
