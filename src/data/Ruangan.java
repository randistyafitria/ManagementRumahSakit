package data;

public class Ruangan {
    private int nomorRuangan;
    private String tipeRuangan;
    private boolean isTersedia;
    private Pasien pasien;

    public Ruangan(int nomorRuangan, String tipeRuangan, boolean isTersedia) {
        this.nomorRuangan = nomorRuangan;
        this.tipeRuangan = tipeRuangan;
        this.isTersedia = isTersedia;
    }

    public int getNomorRuangan() {
        return nomorRuangan;
    }

    public String getTipeRuangan() {
        return tipeRuangan;
    }

    public Boolean getIsTersedia(){
        return isTersedia;
    }

    public void setTipeRuangan(String tipeRuangan) {
        this.tipeRuangan = tipeRuangan;
    }

    
    public void tetapkanUntukPasien(Pasien pasien) {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Ruangan nomor " + nomorRuangan + " telah ditetapkan untuk pasien " + pasien.getNama());
            this.pasien = pasien;
        } else {
            System.out.println("Ruangan nomor " + nomorRuangan + " tidak tersedia");
        }
    }
    
    public void kosongkanRuangan() {
        isTersedia = true;
        System.out.println("Ruangan nomor " + nomorRuangan + " sekarang kosong");
        this.pasien = null;
    }

    public void getDetail() {

        System.out.println("Nomor Ruangan: " + nomorRuangan);
        System.out.println("Tipe Ruangan: " + tipeRuangan);
        System.out.println("Status Ruangan: " + (isTersedia == true ? "Tersedia" : "Terisi"));
        System.out.println("Pasien: " + (pasien != null ? pasien.getNama() : "Tidak ada pasien"));
    }

}
