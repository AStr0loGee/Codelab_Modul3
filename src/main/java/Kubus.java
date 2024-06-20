import java.util.Scanner;

public class Kubus extends BangunRuang{
    private double tinggi;

    public Kubus(String name) {
        super(name);
    }
    @Override
    public void input_Nilai() {
        super.input_Nilai();
        Scanner input_user = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        tinggi = input_user.nextDouble();
    }
    @Override
    public void luas_Permukaan() {
        super.luas_Permukaan();
        double area_kubus = 6*tinggi*tinggi;
        System.out.printf("Luas Kubus dengan tinggi %.2fcm = %.2fcm\n",tinggi,area_kubus);
    }
    @Override
    public void volume() {
        super.volume();
        double volume_kubus = tinggi*tinggi*tinggi;
        System.out.printf("Volume Kubus dengan tinggi %.2fcm = %.2fcm\n",tinggi,volume_kubus);
    }
}
