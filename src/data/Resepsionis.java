package data;


public class Resepsionis extends Orang {

    public Resepsionis(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idKaryawan) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak, idKaryawan);
    }

    public void jadwalkanJanjiTemu(Pasien pasien, Dokter dokter) {
        System.out.println("Resepsionis " + getNama() + " menjadwalkan janji temu antara pasien " + pasien.getNama() + " dengan dokter " + dokter.getNama());
    }
}