package data;

import data.Ruangan;

public class Pasien extends Orang {
    private String riwayatMedis;
    private String kondisiSaatIni;
    private Ruangan ruanganPerawatan = null;

    public Pasien(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idPasien, String riwayatMedis, String kondisiSaatIni) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak, idPasien);
        this.riwayatMedis = riwayatMedis;
        this.kondisiSaatIni = kondisiSaatIni;
    }

    public String getRiwayatMedis() {
        return riwayatMedis;
    }

    public String getKondisiSaatIni() {
        return kondisiSaatIni;
    }

    public Ruangan getRuanganPerawatan() {
        return ruanganPerawatan;
    }


    public void setRiwayatMedis(String riwayatMedis) {
        this.riwayatMedis = riwayatMedis;
    }

    public void setKondisiSaatIni(String kondisiSaatIni) {
        this.kondisiSaatIni = kondisiSaatIni;
    }

    public void setRuanganPerawatan(Ruangan ruanganPerawatan) {
        this.ruanganPerawatan = ruanganPerawatan;
    }

    @Override
    public void getDetail() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Kontak: " + getNomorKontak());
        System.out.println("Riwayat Medis: " + riwayatMedis);
        System.out.println("Kondisi Saat Ini: " + kondisiSaatIni);

        if(ruanganPerawatan != null){
            System.out.println("Saat ini sedang dirawat di ruangan: " + ruanganPerawatan.getNomorRuangan());
            return;
        }
        System.out.println("Sedang tidak dirawat di ruangan");
    }
}
