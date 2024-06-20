public class BangunRuang {
    private String name;

    public BangunRuang(String name){
        this.name = name;
    }
    public void input_Nilai(){
        System.out.println("Menghitung Luas dan volume Bangun Ruang");
    }
    public void luas_Permukaan() {
        System.out.println("--Luas--");
    }
    public void volume(){
        System.out.println("--Volume--");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
