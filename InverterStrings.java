
import java.util.Scanner;
public class InverterStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String stringInvertida = inverteString(entrada);
        System.out.println("String invertida: " + stringInvertida);
    }

    public static String inverteString(String string) {
        String stringInvertida = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }
        return stringInvertida;
    }
}
