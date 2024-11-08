package data;


public class Resepsionis extends Orang {
    private String idKaryawan;

    public Resepsionis(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idKaryawan) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak);
        this.idKaryawan = idKaryawan;
    }

    public String getIdKaryawan(){
        return idKaryawan;
    }

    public void jadwalkanJanjiTemu(Pasien pasien, Dokter dokter) {
        System.out.println("Resepsionis " + getNama() + " menjadwalkan janji temu antara pasien " + pasien.getNama() + " dengan dokter " + dokter.getNama());
    }
}