public class Zadanie3 {
    public static void zadanie(){
        int[] tablica = {2, 3, 3, 5, 8,8,5,6,2};

        try {
            int x = tablica[33];
            System.out.println("Wartość: " + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Podano obszar poza tablicą");
        }
    }
}
