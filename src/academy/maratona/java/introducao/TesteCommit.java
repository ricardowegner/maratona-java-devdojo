package academy.maratona.java.introducao;

import java.util.Scanner;

public class TesteCommit {
    public static void main(String[] args) {
        //making a simple scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diga algo");
        String textoDigitado = entrada.nextLine();
        System.out.println("Você disse: " + textoDigitado);
        entrada.close();
    }
}
