

public class Zadanie4 {
    public static class Wyjatek extends Exception{
        public Wyjatek(String messege){
            super(messege);
        }


    }
    public static void zadanie() {
        int a = 12;
        int b = 0;
        int wynik = 0;
        try {
            if (b == 0) {
                throw new Wyjatek("Nie dzielizmy przez zero");
            }
            wynik = a/b;
            System.out.println("Wynik: "+wynik);
        } catch (Wyjatek e){
            System.out.println("Własny wyjatek  "+ e.getMessage());
        }
    }



}
