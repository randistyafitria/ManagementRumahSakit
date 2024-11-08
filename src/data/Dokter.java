package data;

public class Dokter extends Orang {
    private String spesialisasi;
    private int tahunPengalaman;

    public Dokter(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idDokter, String spesialisasi, int tahunPengalaman) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak, idDokter);
        this.spesialisasi = spesialisasi;
        this.tahunPengalaman = tahunPengalaman;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public int getTahunPengalaman() {
        return tahunPengalaman;
    }


    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void setTahunPengalaman(int tahunPengalaman) {
        this.tahunPengalaman = tahunPengalaman;
    }

    @Override
    public void getDetail() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Kontak: " + getNomorKontak());
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Tahun Pengalaman: " + tahunPengalaman + " Tahun");
    }


    public void diagnosisPasien(Pasien pasien) {
        System.out.println("Dokter " + getNama() + " sedang mendiagnosis pasien " + pasien.getNama());
    }

    public void tulisResep(Pasien pasien) {
        System.out.println("Dokter " + getNama() + " menulis resep untuk pasien " + pasien.getNama());
    }
}
