import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Napiši koliko šolja kafe ti treba: ");
        int šolje = unos.nextInt();

        int voda = 200 * šolje;
        int mlijeko = 50 * šolje;
        int zrnaKafe = 15 * šolje;

        System.out.printf("Za %d šolja kafe ti treba: ", šolje);
        System.out.printf("%n %d ml vode", voda);
        System.out.printf("%n %d ml mlijeka", mlijeko);
        System.out.printf("%n %d g zrna kafe", zrnaKafe);
    }
}