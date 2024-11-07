class Penerima {
    private String nama;
    private String alamat;
    private String jenisBantuan;

    public Penerima(String nama, String alamat, String jenisBantuan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisBantuan = jenisBantuan;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Penerima:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Bantuan: " + jenisBantuan);
    }

    public String getNama() {
        return nama;
    }
}
