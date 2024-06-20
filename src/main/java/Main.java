import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok("==== Balok ====");
        Tabung tabung = new Tabung("==== Tabung ====");
        Kubus kubus = new Kubus("==== Kubus ====");

        balok.setName("CALCULATOR Balok");
        tabung.setName("CALCULATOR Tabung");
        kubus.setName("CALCULATOR Kubus");

            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. "+kubus.getName());
                System.out.println("2. "+balok.getName());
                System.out.println("3. "+tabung.getName());
                System.out.println("4. EXIT");
                System.out.print("Pilihan Anda: ");
                int pilihan = scanner.nextInt();
                    if (pilihan == 1){
                        System.out.println(kubus.getName());
                        kubus.input_Nilai();
                        kubus.luas_Permukaan();
                        kubus.volume();
                        System.out.println();
                    } else if (pilihan == 2) {
                        System.out.println(balok.getName());
                        balok.input_Nilai();
                        balok.luas_Permukaan();
                        balok.volume();
                        System.out.println();
                    } else if (pilihan == 3) {
                        System.out.println(tabung.getName());
                        tabung.input_Nilai();
                        tabung.luas_Permukaan();
                        tabung.volume();
                        System.out.println();
                    }else if (pilihan == 4){
                        System.out.println("Exiting Program..");
                        break;
                    }else {
                        System.out.println("Invalid Input");
                        System.out.println();
                    }
            }
    }
}
