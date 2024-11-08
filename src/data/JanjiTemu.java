package data;

import java.util.Date;

public class JanjiTemu {
    private String idJanjiTemu;
    private Date tanggalJanjiTemu;
    private Dokter dokter;
    private Pasien pasien;

    public JanjiTemu(String idJanjiTemu, Date tanggalJanjiTemu, Dokter dokter, Pasien pasien) {
        this.idJanjiTemu = idJanjiTemu;
        this.tanggalJanjiTemu = tanggalJanjiTemu;
        this.dokter = dokter;
        this.pasien = pasien;
    }

    public String getIdJanjiTemu(){
        return idJanjiTemu;
    }

    public Date getTanggalJanjiTemu(){
        return tanggalJanjiTemu;
    }

    public void konfirmasiJanjiTemu() {
        System.out.println("Janji temu antara pasien " + pasien.getNama() + " dengan dokter " + dokter.getNama() + " telah dikonfirmasi.");
    }
}