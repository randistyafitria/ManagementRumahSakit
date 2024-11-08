package data;

public class Perawat extends Orang {
    private String spesialisasi;

    public Perawat(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idPerawat, String spesialisasi) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak ,idPerawat);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi){
        this.spesialisasi = spesialisasi;
    }


    @Override
    public void getDetail() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Kontak: " + getNomorKontak());
        System.out.println("Spesialisasi: " + spesialisasi);
    }

}