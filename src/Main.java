import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Mobil mobil1 = new Mustibisha(5, false);
        Mobil mobil2 = new Toyomba(5, true, true);
        Mobil mobil3 = new Lempergember(6, false, true, true);
        Mobil mobil4 = new Lempergember(6, false, true, false);

        printBill(mobil1);
        printBill(mobil2);
        printBill(mobil3);
        printBill(mobil4);
    }

    public static void printBill (Mobil mobil) {
        System.out.println("Merk Mobil: " + mobil.getTipe());
        System.out.println("Total Biaya Sewa: " + mobil.hitungBiayaSewa());
        System.out.println("Deposito: " + mobil.hitungDepo());
        System.out.println();
    }

    public static void menu () {
        int sewaHari;
        boolean ban;
        System.out.println("    NgawiMotors");
        System.out.println("1. Mustibisha");
        System.out.println("2. Toyomba");
        System.out.println("3. Lempergember");
        System.out.println("Mau pilih mobil apa: ");
        int input = scan.nextInt();
        scan.nextLine();

        switch (input) {
            case 1:
                System.out.println("Mau sewa berapa hari: ");
                sewaHari = scan.nextInt();
                System.out.println("Mau pakai ban serep atua tidak (true/false): ");
                ban = scan.nextBoolean();
                Mobil mobil1 = new Mustibisha(input, ban);
                break;
        
            case 2:
                System.out.println("Mau sewa berapa hari: ");
                sewaHari = scan.nextInt();
                System.out.println("Mau pakai ban serep atua tidak (true/false): ");
                ban = scan.nextBoolean();
                Mobil mobil2 = new Toyomba(i);
                break;
            default:
                break;
        }
    }
}