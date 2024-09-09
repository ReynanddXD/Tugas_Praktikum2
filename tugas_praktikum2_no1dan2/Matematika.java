package tugas_praktikum2_no1dan2;

public class Matematika implements InterfaceMatematika {
    int HasilPertambahan;
    int HasilPengurangan;
    int HasilPerkalian;
    int HasilPembagian;
    
    //Operasi untuk pertambahan    
    public void pertambahan(int a, int b) {
        HasilPertambahan = a + b;
        System.out.println("Operasi Pertambahan : "+a+" + "+b+" = "+HasilPertambahan);
    }

    // Operasi untuk pengurangan
    public void pengurangan(int a, int b) {
        HasilPengurangan = a - b;
        System.out.println("Operasi Pengurangan : "+a+" - "+b+" = "+HasilPengurangan);
    }

    // Operasi untuk perkalian
    public void perkalian(int a, int b) {
        HasilPerkalian = a * b;
        System.out.println("Operasi Perkalian : "+a+" * "+b+" = "+HasilPerkalian);
    }

    // Operasi untuk pembagian
    public void pembagian(int a, int b) {
        HasilPembagian = a / b;
        System.out.println("Operasi Pembagian : "+a+" / "+b+" = "+HasilPembagian);
    }
}