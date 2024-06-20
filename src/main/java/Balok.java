import java.util.Scanner;

public class Balok extends BangunRuang{
    private double tinggi;
    private double lebar;
    private double panjang;

    public Balok(String name) {
        super(name);
    }
    @Override
    public void input_Nilai() {
        super.input_Nilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Tinggi = ");
        tinggi = scanner.nextDouble();
        System.out.print("Masukkan Nilai Lebar = ");
        lebar = scanner.nextDouble();
        System.out.print("Masukkan Nilai Panjang = ");
        panjang = scanner.nextDouble();
    }
    @Override
    public void volume() {
        super.volume();
        double volume_balok = panjang*tinggi*lebar;
        System.out.printf("Volume balok dengan panjang %.2fcm, tinggi %.2fcm, dan lebar %.2fcm = %.2fcm\n",panjang,tinggi,lebar,volume_balok);
    }
    @Override
    public void luas_Permukaan() {
        super.luas_Permukaan();
        double area_balok = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.printf("Luas Balok dengan tinggi %.2fcm, panjang %.2fcm, dan lebar %.2fcm = %.2fcm\n",tinggi,panjang,lebar,area_balok);
    }
}
