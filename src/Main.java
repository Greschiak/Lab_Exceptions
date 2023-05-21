import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wybor = 0;
        do{
            MENU();
            try{
                wybor = Integer.parseInt(scanner.nextLine());
                switch (wybor) {
                    case 1:
                        Zadanie1.zadanie();
                        break;
                    case 2:
                        Zadanie2.zadanie();
                        break;
                    case 3:
                        Zadanie3.zadanie();
                        break;
                    case 4:
                        Zadanie4.zadanie();
                        break;
                    case 5:
                        Zadanie5.zadanie();
                        break;
                    case 6:
                        Zadanie6.zadanie();
                        break;
                    case 7:
                        System.out.println("Wyjdź z programu");
                        break;
                    default:
                        System.out.println("Podaj wybór jeszcze raz");
                }
            } catch (Exception e){
                System.out.println("Podaj wybór jeszcze raz");
            }

        } while(wybor != 7);


    }
    public static void MENU(){
        System.out.println("Wybierz zadanie:");
        System.out.println("1.Zadanie 1");
        System.out.println("2.Zadanie 2");
        System.out.println("3.Zadanie 3");
        System.out.println("4.Zadanie 4");
        System.out.println("5.Zadanie 5");
        System.out.println("6.Zadanie 6");
        System.out.println("7.Wyjdź");
    }
}