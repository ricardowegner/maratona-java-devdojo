package academy.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
    // A condição é que a valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        double parcelas = 0;
        for (int i = 1000; i <= valorTotal; i += 1000) {
            if (i > 40000) {
                break;
            } else {
                ++parcelas;
            }
        }
        System.out.println("Número total de parcelas: " + parcelas);
    }
}
