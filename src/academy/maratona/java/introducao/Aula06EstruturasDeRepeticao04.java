package academy.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
    // A condição é que a valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Número de parcelas: " + parcela + " Valor parcela: " + valorParcela);
        }

    }
}
