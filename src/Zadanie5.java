import java.util.Random;

public class Zadanie5 {
    public static void zadanie() {
        int proba = 0;
        Random Liczba = new Random();

        while (proba< 3) {
            int a = Liczba.nextInt(21) - 10;
            int b = Liczba.nextInt(21) - 10;
            try {
                int wynik = a/b;
                System.out.println("Wynik: " +wynik);
            } catch (ArithmeticException e) {
                System.out.println("Nie można dzielic przez 0");
                proba++;
            }
        }
    }

}
