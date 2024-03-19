
import java.util.Scanner;

public class Main {
    
    public static String inverterString(String string) {
        int tamanho = string.length();
        StringBuilder stringInvertida = new StringBuilder();
        for (int i = tamanho - 1; i >= 0; i--) {
            stringInvertida.append(string.charAt(i));
        }
        return stringInvertida.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String resultado = inverterString(entrada);
        System.out.println("String invertida: " + resultado);

        scanner.close();
    }
}
