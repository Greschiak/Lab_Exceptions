import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void zadanie() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj liczbę: ");
            double liczba = scanner.nextDouble();
            if (liczba < 0) {
                throw new IllegalArgumentException("Nie może być liczba ujemna");
            }

            System.out.println("Pierwiastek: " + Math.sqrt(liczba));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Nie mogą być znaki");
        }
    }
}


