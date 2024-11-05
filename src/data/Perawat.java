package data;

public class Perawat extends Orang {
    private String idPerawat;
    private String bangsalTugas;

    public Perawat(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak,
                   String idPerawat, String bangsalTugas) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak);
        this.idPerawat = idPerawat;
        this.bangsalTugas = bangsalTugas;
    }

    public void bantuDokter(Dokter dokter, Pasien pasien) {
        System.out.println("Perawat " + nama + " membantu Dokter " + dokter.nama + " merawat pasien " + pasien.getNama());
    }

    public void cekTandaVital(Pasien pasien) {
        System.out.println("Perawat " + nama + " memeriksa tanda vital pasien " + pasien.getNama());
    }
}