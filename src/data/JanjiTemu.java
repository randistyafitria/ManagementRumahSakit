package data;

import java.util.Date;
import java.text.SimpleDateFormat;
import utils.Global;

public class JanjiTemu {
    private String idJanjiTemu;
    private Date tanggalJanjiTemu;
    private Dokter dokter;
    private Pasien pasien;

    private boolean persetujuanPasien = false;
    private boolean persetujuanDokter = false;



    public JanjiTemu(String idJanjiTemu, Date tanggalJanjiTemu, Dokter dokter, Pasien pasien) {
        this.idJanjiTemu = idJanjiTemu;
        this.tanggalJanjiTemu = tanggalJanjiTemu;
        this.dokter = dokter;
        this.pasien = pasien;
    }

    public Pasien getPasien(){
        return pasien;
    }

    public Dokter getDokter(){
        return dokter;
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

    public void getDetail(){
        System.out.println("Tanggal: " + new SimpleDateFormat("dd MM yyyy").format(tanggalJanjiTemu));
        System.out.println("Pasien: " + pasien.getNama());
        System.out.println("Dokter: " + dokter.getNama());
    }


    public void setujuiJanjiTemuPasien(){
        persetujuanPasien = true;
        checkPersetujuan();
    }

    public void tolakJanjiTemuPasien(){
        persetujuanPasien = false;
        checkPersetujuan();
    }


    public void setujuJanjiTemuDokter(){
        persetujuanDokter = true;
        checkPersetujuan();
    }

    public void tolakJanjiTemuDokter(){
        persetujuanDokter = false;
        checkPersetujuan();
    }


    public void checkPersetujuan(){
        if(persetujuanDokter == true && persetujuanPasien == true){
            Global.janjiTemuAktif.add(this);
            Global.janjiTemuPending.remove(this);
        }
        else{
            Global.janjiTemuAktif.remove(this);
            Global.janjiTemuPending.add(this);
        }
    }

    public String getStatusPersetujuan(){
        if (persetujuanDokter == true && persetujuanPasien == false) {
            return "Dokter sudah menyetujui Janji Temu ini, namun pasien belum!";
        } else if (persetujuanDokter == false && persetujuanPasien == false) {
            return "Dokter dan pasien belum menyetujui Janji Temu ini!";
        } else if (persetujuanDokter == true && persetujuanPasien == true) {
            return "Dokter dan pasien sudah menyetujui Janji Temu ini!";
        } else if (persetujuanDokter == false && persetujuanPasien == true) {
            return "Pasien sudah menyetujui Janji Temu ini, namun dokter belum!";
        }
        return "Status persetujuan tidak dapat ditentukan.";
    }

    public void batalkanJanjiTemu(){
        Global.janjiTemuAktif.remove(this);
    }

    //TODO: mungkin bisa dieksekusi dokter sama resepsionis? sama mungkin admin? apa gausah? malas 
    public void jadwalUlangJanjiTemu(){

    }

}