package academy.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
    // A condição é que a valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                continue;
            }
            System.out.println("Número de parcelas: " + parcela + " Valor parcela: " + valorParcela);

        }

    }
}
