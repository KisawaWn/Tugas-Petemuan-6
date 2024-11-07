public class Main {
    public static void main(String[] args) {
        Donatur donatur1 = new Donatur("Rudi", "Malang", "081282396735", 4500000);
        donatur1.tampilkanInfo();  
        System.out.println();
        
  
        Penerima penerima1 = new Penerima("Geri", "Blitar", "Bantuan Sembako");  
        penerima1.tampilkanInfo();
        System.out.println();
        

        System.out.println("Pembayaran zakat oleh " + donatur1.getNama() + " untuk " + penerima1.getNama());
        System.out.println("Jumlah zakat yang dibayarkan: " + donatur1.getJumlahZakat());
        
    }
}