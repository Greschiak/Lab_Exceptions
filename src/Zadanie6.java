import java.util.Scanner;



public class Zadanie6 {
    public static void zadanie() {
        run();

    }

    public static void run() {
        Scanner wprowadzanie = new Scanner(System.in);
        Menu();
        int wybor;
        try {
            do {
                wybor = Integer.parseInt(wprowadzanie.nextLine());
                switch (wybor) {
                    case 1:
                        Suma();
                        break;
                    case 2:
                        Roznica();
                        break;
                    case 3:
                        Iloczyn();
                        break;
                    case 4:
                        Iloraz();
                        break;
                    case 5:
                        Potega();
                        break;
                    case 6:
                        Pierwiastek();
                        break;
                    case 7:
                        funTryg();
                        break;
                    case 8:
                        Tablica();
                        break;
                    default:
                        System.out.println("Wprowadz wybor jeszcze raz");
                }
                Menu();
            } while (wybor != 0);
                Close();

        } catch (Exception e) {
            System.out.println("Wprowadz wybor jeszcze raz");
            run();
        }
    }



    public static String WprowadzanieString() {
        Scanner wprowadzanie = new Scanner(System.in);
        String napis = wprowadzanie.next();
        return napis;
    }

    public static double WprowadzanieDouble() {
        Scanner wprowadzanie = new Scanner(System.in);
        double liczba = wprowadzanie.nextDouble();
        return liczba;
    }

    public static int WprowadzanieInt() {
        Scanner wprowadzanie = new Scanner(System.in);
        int liczba = wprowadzanie.nextInt();
        return liczba;
    }

    public static void Menu() {
        System.out.println("Wybierz operacje, ktore chcesz by program wykonal");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnozenie");
        System.out.println("4.Dzielenie");
        System.out.println("5.Potegowanie");
        System.out.println("6.Pierwiastkowanie");
        System.out.println("7.Funkcje trygonometryczne");
        System.out.println("8.Tablica");
        System.out.println("0.Zakoncz dzialanie programu");
    }
    public static void Menu2() {
        System.out.print("\n--------------------------------------------------------------------------\n");
        System.out.println("Wybierz operacje, ktore chcesz by program wykonal");
        System.out.println("1.Wypiswanie od poczatku");
        System.out.println("2.Wypiswyanie od tylu");
        System.out.println("3.Wypisywanie nieparzystych");
        System.out.println("4.Wypisywanie parzystych");
        System.out.println("5.Wypisywanie sumy tablic");
        System.out.println("6.Wypisywanie iloczynu tablic");
        System.out.println("7.Wypisywanie sredniej");
        System.out.println("8.Wypisywanie Min");
        System.out.println("9.Wypisywanie Max");
        System.out.println("0.Wroc do kalkulatora");
    }


    public static void Suma() {
        try {
            System.out.print("Wprowadz 1 liczbe: ");
            double a = WprowadzanieDouble();
            System.out.print("Wprowadz 2 liczbe: ");
            double b = WprowadzanieDouble();
            double wynik = a + b;
            System.out.print("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void Roznica() {
        try {
            System.out.print("Wprowadz 1 liczbe: ");
            double a = WprowadzanieDouble();
            System.out.print("Wprowadz 2 liczbe: ");
            double b = WprowadzanieDouble();
            double wynik = a - b;
            System.out.print("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }


    public static void Iloczyn() {
        try {
            System.out.print("Wprowadz 1 liczbe: ");
            double a = WprowadzanieDouble();
            System.out.print("Wprowadz 2 liczbe: ");
            double b = WprowadzanieDouble();
            double wynik = a * b;
            System.out.print("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void Iloraz() {
        try {
            System.out.print("Wprowadz 1 liczbe: ");
            double a = WprowadzanieDouble();
            System.out.print("Wprowadz 2 liczbe: ");
            double b = WprowadzanieDouble();
            if (b == 0) {
                throw new ArithmeticException("Nie można dzielić przez 0.");
            }
            double wynik = a / b;
            System.out.print("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void Potega() {
        try {
            System.out.print("Wprowadz liczbe: ");
            double a = WprowadzanieDouble();
            System.out.print("Wprowadz do ktorej potegi: ");
            double b = WprowadzanieDouble();
            double wynik = Math.pow(a, b);
            System.out.println("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void Pierwiastek() {
        try {
            System.out.print("Wprowadz liczbe: ");
            double a = WprowadzanieDouble();
            if (a < 0) {
                throw new IllegalArgumentException("Nie można pierwiastkować liczby ujemnej.");
            }
            double wynik = Math.sqrt(a);
            System.out.println("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void funTryg() {
        try {
            System.out.print("Wprowadz kat w stopniach: ");
            double a = WprowadzanieDouble();
            double radians = Math.toRadians(a);
            double wynik = Math.sin(radians);
            System.out.println("Wynik: " + wynik + "\n");
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void Tablica() {
        double[] Liczby = new double[10];
        int i = 0;
        while (i < 10) {
            try{System.out.print("Podaj " + (i + 1) + ". liczbę: ");
                Liczby[i] = WprowadzanieDouble();
                i++;

            } catch (Exception e){
                System.out.println("Błąd: " + e.getMessage());
            }


        }

        int wybor;

        do {
            try {
                Menu2();
                wybor = WprowadzanieInt();
                switch (wybor) {
                    case 1:
                        OdPoczatku(Liczby);
                        break;
                    case 2:
                        OdTylu(Liczby);
                        break;
                    case 3:
                        Nieparzyste(Liczby);
                        break;
                    case 4:
                        Parzyste(Liczby);
                        break;
                    case 5:
                        SumeTablic(Liczby);
                        break;
                    case 6:
                        IloczynTablic(Liczby);
                        break;
                    case 7:
                        SredniaTablic(Liczby);
                        break;
                    case 8:
                        MinTablic(Liczby);
                        break;
                    case 9:
                        MaxTablic(Liczby);
                        break;
                    default:
                        System.out.println("Podaj wybór jeszcze raz");
                }
            } catch (Exception e) {
                System.out.println("Podaj wybór jeszcze raz");
                wybor = -1;
            }
        } while (wybor != 0);

    }

    public static void OdPoczatku(double[] tablica) {
        System.out.print("Tablica od poczatku: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

    public static void OdTylu(double[] tablica) {
        System.out.print("\nTablica od tylu: ");
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
    }

    public static void Nieparzyste(double[] tablica) {
        System.out.print("\nNieparzyste: ");
        for (int i = 1; i < tablica.length; i = i + 2) {
            System.out.print(tablica[i] + " ");
        }
    }

    public static void Parzyste(double[] tablica) {
        System.out.print("\nParzyste: ");
        for (int i = 0; i < tablica.length; i = i + 2) {
            System.out.print(tablica[i] + " ");
        }
    }

    public static void SumeTablic(double[] tablica) {
        double Suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            Suma = Suma + tablica[i];
        }
        System.out.println("\nSuma: " + Suma);
    }

    public static void IloczynTablic(double[] tablica) {
        double iloczyn = 1;
        for (int i = 0; i < tablica.length; i++) {
            iloczyn *= tablica[i];
        }
        System.out.println("Iloczyn: " + iloczyn);
    }

    public static void SredniaTablic(double[] tablica) {
        double Suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            Suma = Suma + tablica[i];
        }
        double srednia = Suma / tablica.length;
        System.out.println("Średnia: " + srednia);
    }

    public static void MinTablic(double[] tablica) {
        double Min = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < Min) {
                Min = tablica[i];
            }
        }
        System.out.println("Min: " + Min);
    }

    public static void MaxTablic(double[] tablica) {
        double Max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > Max) {
                Max = tablica[i];
            }
        }
        System.out.println("Max: " + Max);
    }


    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = WprowadzanieString();
        String st1 = "t";
        String st2 = "T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
        else
            zadanie();
    }
}
