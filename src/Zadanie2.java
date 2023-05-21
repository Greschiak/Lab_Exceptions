import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static class WprowadzZKonsoli {
        Scanner scanner = new Scanner(System.in);
        public int GetInt(){
            boolean poprawne = false;
            int liczba = 0;
            while (poprawne == false) {
                try {
                    System.out.print("Wprowadź liczbę int: ");
                    liczba = Integer.parseInt(scanner.nextLine());
                    poprawne = true;

                } catch (NumberFormatException e) {
                    System.out.println("Złe dane.");
                }
            }
            return liczba;
        }
        public char GetChar() {
            System.out.print("Wprowadź znak char: ");
            char znak = scanner.nextLine().charAt(0);
            return znak;
        }

        public long GetLong() {
            boolean poprawne = false;
            long liczba = 0;
            while (!poprawne) {
                try {
                    System.out.print("Wprowadź liczbę long: ");
                    liczba = Long.parseLong(scanner.nextLine());
                    poprawne = true;
                } catch (NumberFormatException e) {
                    System.out.println("Złe dane");
                }
            }
            return liczba;
        }

        public short GetShort() {
            boolean poprawne = false;
            short liczba = 0;
            while (!poprawne) {
                try {
                    System.out.print("Wprowadź liczbę short: ");
                    liczba = Short.parseShort(scanner.nextLine());
                    poprawne = true;
                } catch (NumberFormatException e) {
                    System.out.println("Złe dane");
                }
            }
            return liczba;
        }

        public float GetFloat() {
            boolean poprawne = false;
            float liczba = 0;
            while (!poprawne) {
                try {
                    System.out.print("Wprowadź liczbę float: ");
                    liczba = Float.parseFloat(scanner.nextLine());
                    poprawne = true;
                } catch (NumberFormatException e) {
                    System.out.println("Złe dane");
                }
            }
            return liczba;
        }

        public double GetDouble() {
            boolean poprawne = false;
            double liczba = 0;
            while (!poprawne) {
                try {
                    System.out.print("Wprowadź liczbę double: ");
                    liczba = Double.parseDouble(scanner.nextLine());
                    poprawne = true;
                } catch (NumberFormatException e) {
                    System.out.println("Złe dane");
                }
            }
            return liczba;
        }

        public String GetString() {
            System.out.print("Wprowadź tekst: ");
            String tekst = scanner.nextLine();
            return tekst;
        }

        }
        public static void  zadanie(){
        WprowadzZKonsoli Wprowadzanie = new WprowadzZKonsoli();
        int liczbaINT = Wprowadzanie.GetInt();
        System.out.println(liczbaINT);
        float liczbaFLOAT = Wprowadzanie.GetFloat();
        System.out.println(liczbaFLOAT);
        char ZnakChar = Wprowadzanie.GetChar();
        System.out.println(ZnakChar);
        Long LiczbaLong = Wprowadzanie.GetLong();
        System.out.println(LiczbaLong);
        Double LiczbaDouble = Wprowadzanie.GetDouble();
        System.out.println(LiczbaDouble);
        String Napis = Wprowadzanie.GetString();
        System.out.println(Napis);
        Short LiczbaShort = Wprowadzanie.GetShort();
        System.out.println(LiczbaShort);




        }


}


