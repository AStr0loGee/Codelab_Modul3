import java.util.Scanner;

public class Tabung extends BangunRuang{
    private double tinggi;
    private double jari_jari;

    public Tabung(String name) {
        super(name);
    }

    @Override
    public void input_Nilai() {
        super.input_Nilai();
        Scanner input_tabung = new Scanner(System.in);
        System.out.print("Masukkan Nilai Tinggi = ");
        tinggi = input_tabung.nextDouble();
        System.out.print("Masukkan Nilai jari-jari = ");
        jari_jari = input_tabung.nextDouble();
    }

    @Override
    public void luas_Permukaan() {
        super.luas_Permukaan();
        double area_tabung = Math.PI*jari_jari*2*(jari_jari+tinggi);
        System.out.printf("Luas Tabung dengan jari-jari %.2fcm dan tinggi %.2fcm = %.2fcm\n",jari_jari,tinggi,area_tabung);
    }

    @Override
    public void volume() {
        super.volume();
        double volume_tabung = Math.PI*jari_jari*jari_jari*tinggi;
        System.out.printf("Volume tabung dengan jari-jari %.2fcm dan tinggi %.2fcm = %.2fcm\n",jari_jari,tinggi,volume_tabung);

    }

}
