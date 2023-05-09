import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Napiši koliko ml vode aparat ima: ");
        int kolicinaVode = unos.nextInt();
        System.out.println("Napiši koliko ml mlijeka aparat ima: ");
        int kolicinaMlijeka = unos.nextInt();
        System.out.println("Napiši koliko grama zrna kafe aparat ima: ");
        int kolicinaZrnaKafe = unos.nextInt();

        System.out.println("Napiši koliko šolja kafe ti treba: ");
        int solje = unos.nextInt();

        int brojsolja = 0;
        while (kolicinaVode >= 200 && kolicinaMlijeka >= 50 && kolicinaZrnaKafe >= 15) {
            kolicinaVode = kolicinaVode - 200;
            kolicinaMlijeka = kolicinaMlijeka - 50;
            kolicinaZrnaKafe = kolicinaZrnaKafe - 15;
            brojsolja++;
        }

        if (brojsolja < solje) {
            System.out.printf("Ne, mogu napraviti samo %d solje kafe", brojsolja);
        } else if (brojsolja > solje) {
            System.out.printf("Da, mogu napraviti tu količinu kafe (i čak %d više od toga)", brojsolja - solje);
        } else if (brojsolja == solje) {
            System.out.println("Da, mogu napraviti tu količinu kafe");
        }
    }
}