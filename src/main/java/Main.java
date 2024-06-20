public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok("==== Balok ====");
        Tabung tabung = new Tabung("==== Tabung ====");
        Kubus kubus = new Kubus("==== Kubus ====");

        balok.setName("CALCULATOR Balok");
        tabung.setName("CALCULATOR Tabung");
        kubus.setName("CALCULATOR Kubus");

        System.out.println(kubus.getName());
        kubus.input_Nilai();
        kubus.luas_Permukaan();
        kubus.volume();
        System.out.println();

        System.out.println(balok.getName());
        balok.setName("balok");
        balok.input_Nilai();
        balok.luas_Permukaan();
        balok.volume();
        System.out.println();

        System.out.println(tabung.getName());
        tabung.setName("tabung");
        tabung.input_Nilai();
        tabung.luas_Permukaan();
        tabung.volume();
        System.out.println();
    }
}
