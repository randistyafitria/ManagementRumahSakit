package data;

public class Perawat extends Orang {
    private String idPerawat;

    public Perawat(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idPerawat) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak);
        this.idPerawat = idPerawat;
    }

    public String getIdPerawat() {
        return idPerawat;
    }


}