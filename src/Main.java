import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int voda = 400;
        int mlijeko = 540;
        int zrna = 120;
        int solje = 9;
        int pare = 225;

        System.out.println("Napiši radnju (kupi, napuni, uzmi, zalihe, ugasi): ");
        String radnja = unos.next();

        while (!radnja.equals("kupi") && !radnja.equals("napuni") && !radnja.equals("uzmi") && !radnja.equals("zalihe") && !radnja.equals("ugasi")) {
            System.out.println("Unio si radnju koja ne postoji, unesi ponovo: ");
            radnja = unos.next();
        }

        while (!radnja.equals("ugasi")) {
            switch (radnja) {
                case "kupi" -> {

                    System.out.println("Šta želiš kupiti? 1 - espreso, 2 - latte, 3 - kapučino: ");

                    String kupnja = unos.next();

                    while (!kupnja.equals("1") && !kupnja.equals("2") && !kupnja.equals("3") && !kupnja.equals("nazad")) {
                        System.out.println("Unio si opciju koja ne postoji, unesi ponovo: ");
                        kupnja = unos.next();
                    }

                    switch (kupnja) {

                        case "1" -> {

                            if (voda >= 250 & zrna >= 16 & solje >= 1) {
                                voda = voda - 250;
                                zrna = zrna - 16;
                                solje = solje - 1;
                                pare = pare + 2;
                                System.out.println("Imam resuresa, pravim kahvu.");
                            } else if (voda < 250 || zrna < 16 || solje < 1) {
                                System.out.println("Nema dovoljno sastojaka.");
                            }

                        }

                        case "2" -> {

                            if (voda >= 350 & mlijeko >= 75 & zrna >= 20 & solje >= 1) {
                                voda = voda - 350;
                                mlijeko = mlijeko - 75;
                                zrna = zrna - 20;
                                solje = solje - 1;
                                pare = pare + 4;
                                System.out.println("Imam resuresa, pravim kahvu.");
                            } else if (voda < 350 || mlijeko < 75 || zrna < 20 || solje < 1) {
                                System.out.println("Nema dovoljno sastojaka.");
                            }

                        }

                        case "3" -> {

                            if (voda >= 200 & mlijeko >= 100 & zrna >= 12 & solje >= 1) {
                                voda = voda - 200;
                                mlijeko = mlijeko - 100;
                                zrna = zrna - 12;
                                solje = solje - 1;
                                pare = pare + 3;
                                System.out.println("Imam resuresa, pravim kahvu.");
                            } else if (voda < 200 || mlijeko < 100 || zrna < 12 || solje < 1) {
                                System.out.println("Nema dovoljno sastojaka.");
                            }

                        }
                        case "nazad" -> {
                        }
                    }
                }
                case "napuni" -> {

                    System.out.println("Napiši koliko ml vode želiš dodati: ");
                    voda = voda + unos.nextInt();

                    System.out.println("Napiši koliko ml mlijeka želiš dodati: ");
                    mlijeko = mlijeko + unos.nextInt();

                    System.out.println("Napiši koliko grama zrna kafe želiš dodati: ");
                    zrna = zrna + unos.nextInt();

                    System.out.println("Napiši koliko jednokratnih šolji želiš dodati: ");
                    solje = solje + unos.nextInt();

                }
                case "uzmi" -> {

                    System.out.printf("Dao sam ti %d KM %n", pare);
                    pare = 0;

                }
                case "zalihe" -> {

                    System.out.println("Aparat za kafu ima: ");
                    System.out.printf("%d ml vode %n", voda);
                    System.out.printf("%d ml mlijeka %n", mlijeko);
                    System.out.printf("%d g zrna kafe %n", zrna);
                    System.out.printf("%d jednokratnih šolji %n", solje);
                    System.out.printf("%d KM %n", pare);

                }
            }

            System.out.println("Napiši radnju (kupi, napuni, uzmi, zalihe, ugasi): ");
            radnja = unos.next();

        }
    }
}