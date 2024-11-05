package data;

public class Dokter extends Orang {
    private String idDokter;
    private String spesialisasi;
    private int tahunPengalaman;

    public Dokter(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak,
                  String idDokter, String spesialisasi, int tahunPengalaman) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak);
        this.idDokter = idDokter;
        this.spesialisasi = spesialisasi;
        this.tahunPengalaman = tahunPengalaman;
    }

    public void diagnosisPasien(Pasien pasien) {
        System.out.println("Dokter " + nama + " sedang mendiagnosis pasien " + pasien.getNama());
    }

    public void tulisResep(Pasien pasien) {
        System.out.println("Dokter " + nama + " menulis resep untuk pasien " + pasien.getNama());
    }
}
