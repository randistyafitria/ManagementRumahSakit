package data;

public class Ruangan {
    private int nomorRuangan;
    private String tipeRuangan;
    private boolean isTersedia;

    public Ruangan(int nomorRuangan, String tipeRuangan, boolean isTersedia) {
        this.nomorRuangan = nomorRuangan;
        this.tipeRuangan = tipeRuangan;
        this.isTersedia = isTersedia;
    }

    public int getNomorRuangan() {
        return nomorRuangan;
    }

    public void tetapkanUntukPasien(Pasien pasien) {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Ruangan nomor " + nomorRuangan + " telah ditetapkan untuk pasien " + pasien.getNama());
        } else {
            System.out.println("Ruangan nomor " + nomorRuangan + " tidak tersedia");
        }
    }

    public void kosongkanRuangan() {
        isTersedia = true;
        System.out.println("Ruangan nomor " + nomorRuangan + " sekarang kosong");
    }
}
