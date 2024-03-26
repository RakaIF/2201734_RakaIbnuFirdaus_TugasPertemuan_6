package pbo_6;

public class NewClassPersegi {
    int panjang;
    int lebar;
    
    public NewClassPersegi() {
        panjang = 0;
        lebar = 0;
    }
    
    public NewClassPersegi(int p, int l){
        panjang = p;
        lebar = l;
    }
    
    int luas(){
        int hasil = panjang * lebar;
        return hasil;
    }
    
    int keliling(){
        int hasil = 2 * (panjang + lebar);
        return hasil;
    }
    
    void setPanjang(int p){
        panjang = p;
    }
    
    void setLebar(int l){
        lebar = l;
    }
}
