package data;

public class Pasien extends Orang {
    private String idPasien;
    private String riwayatMedis;
    private String kondisiSaatIni;

    public Pasien(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak,
                  String idPasien, String riwayatMedis, String kondisiSaatIni) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak);
        this.idPasien = idPasien;
        this.riwayatMedis = riwayatMedis;
        this.kondisiSaatIni = kondisiSaatIni;
    }


    public void lihatRiwayatMedis() {
        System.out.println("Riwayat Medis: " + riwayatMedis);
    }
}