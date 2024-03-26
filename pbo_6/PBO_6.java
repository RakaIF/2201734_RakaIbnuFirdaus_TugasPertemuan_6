package pbo_6;

public class PBO_6 {
    
    public static void main(String[] args) {
        int Luas, Keliling;
        NewClassPersegi persegi1 = new NewClassPersegi();
        persegi1.setPanjang(25);
        persegi1.setLebar(35);
        Luas = persegi1.luas();
        System.out.println("Luas = " + Luas);
        Keliling = persegi1.keliling();
        System.out.println("Keliling = " + Keliling);
    }
}
