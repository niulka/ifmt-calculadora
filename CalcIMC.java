import javax.swing.JOptionPane;

public class CalcIMC {
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Insira o peso");
        String altura = JOptionPane.showInputDialog("Insira a altura");

        float number1 = Float.parseFloat(peso);
        float number2 = Float.parseFloat(altura);

        float calc = (float) (number1 / (Math.pow(number2, 2)));

        JOptionPane.showMessageDialog(
                null,
                String.format("IMC: %.2f\nVocê está %s", calc,
                        (calc <= 18.5
                                ? "abaixo do peso normal"
                                : calc <= 24.9
                                        ? "com o peso normal"
                                        : calc <= 29.9
                                                ? "acima do peso"
                                                : calc <= 34.9
                                                        ? "com obesidade classe I"
                                                        : calc <= 39.9
                                                                ? "com obesidade classe II"
                                                                : calc > 39.9
                                                                        ? "com obesidade classe III"
                                                                        : "")),
                "Cálculo IMC",
                JOptionPane.PLAIN_MESSAGE);
    }
}
