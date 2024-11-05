package data;

public class Orang {
    protected String nama;
    protected int umur;
    protected String jenisKelamin;
    protected String alamat;
    protected String nomorKontak;

    public Orang(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.nomorKontak = nomorKontak;
    }

    public String getNama() {
        return nama;
    }

    public void getDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Kontak: " + nomorKontak);
    }
}
