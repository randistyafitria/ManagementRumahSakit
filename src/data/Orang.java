package data;


public abstract class Orang {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String alamat;
    private String nomorKontak;
    private String id;

    public Orang(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String id) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.nomorKontak = nomorKontak;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorKontak() {
        return nomorKontak;
    }

    public String getId(){
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorKontak(String nomorKontak) {
        this.nomorKontak = nomorKontak;
    }


    

    public void getDetail() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Kontak: " + nomorKontak);
    }
}
