package data;

import utils.Global;

public class Pasien extends Orang {
    private String riwayatMedis;
    private String kondisiSaatIni;
    private Ruangan ruanganPerawatan = null;

    public Pasien(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idPasien, String riwayatMedis, String kondisiSaatIni) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak, idPasien);
        this.riwayatMedis = riwayatMedis;
        this.kondisiSaatIni = kondisiSaatIni;
    }

    public String getRiwayatMedis() {
        return riwayatMedis;
    }

    public String getKondisiSaatIni() {
        return kondisiSaatIni;
    }

    public Ruangan getRuanganPerawatan() {
        return ruanganPerawatan;
    }


    public void setRiwayatMedis(String riwayatMedis) {
        this.riwayatMedis = riwayatMedis;
    }

    public void setKondisiSaatIni(String kondisiSaatIni) {
        this.kondisiSaatIni = kondisiSaatIni;
    }

    public void setRuanganPerawatan(Ruangan ruanganPerawatan) {
        this.ruanganPerawatan = ruanganPerawatan;
    }

    @Override
    public void getDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Kontak: " + getNomorKontak());
        System.out.println("Riwayat Medis: " + riwayatMedis);
        System.out.println("Kondisi Saat Ini: " + kondisiSaatIni);

        if(ruanganPerawatan != null){
            System.out.println("Saat ini sedang dirawat di ruangan: " + ruanganPerawatan.getNomorRuangan());
            return;
        }
        System.out.println("Sedang tidak dirawat di ruangan");
    }

    public void displayPasien(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu Aktif");
            System.out.println("3. Lihat Jadwal Janji Temu Pending");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();


            switch (choice) {
                case 0:
                    break;
                case 1:
                    getDetail();
                    break;
                case 2:
                    listJanjiTemuAktif();
                    break;
                case 3: 
                    listJanjiTemuPending();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }



    //temp, add so it can go left, right
    public void listJanjiTemuAktif(){
        for(JanjiTemu jt : Global.janjiTemuAktif){
            if(jt.getPasien().getId().equals(getId())){
                jt.getDetail();
            }
        }
    }


    //need fix, same with the dokter one, 
    public void listJanjiTemuPending(){

        int choice = 1;
        int index = 0;

        while(choice != 0){

            if(Global.janjiTemuPending.isEmpty()){
                System.out.println("Tidak ada janji temu yang belum disetujui");
                return;
            }
            System.out.println("====================================");
            JanjiTemu currJt = Global.janjiTemuPending.get(index);
            currJt.getDetail();
            System.out.println(currJt.getStatusPersetujuan());
            System.out.println("====================================");

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Selanjutnya");
            System.out.println("2. Sebelumnya");
            System.out.println("3. Setujui Janji Temu");
            System.out.println("4. Tolak Janji Temu");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 


            switch (choice) {
                case 0:
                    break;
                case 1:
                    if(index < Global.janjiTemuPending.size() - 1){
                        index++;
                    }                    
                    break;
                case 2:
                    if(index > 0){
                        index--;
                    }
                    break;
                case 3: 
                    currJt.setujuiJanjiTemuPasien();
                    break;
                case 4: 
                    currJt.tolakJanjiTemuPasien();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //TODO: buat switch case, tanyai user mau edit apa, sesuain sama atribut
    public void editPasien(){

    }


    //TODO: Error handling
    public void editKeadaanPasien(){
        System.out.println("Keadaan Pasien saat ini: " + kondisiSaatIni);
        System.out.print("Silahkan input kondisi pasien yang terbaru: ");
        String kondisiBaru = Global.scanner.nextLine();

        setKondisiSaatIni(kondisiBaru);
    }


}
