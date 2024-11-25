package data;

import java.util.List;

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
        int choice = 1;
        int index = 0;

        List<JanjiTemu> listJanjiTemuAktif = Global.getFilteredJanjiTemuAktif(getId());


        if(listJanjiTemuAktif.isEmpty()){
            System.out.println("Anda tidak mempunyai janji temu yang sedang aktif");
            return;
        }


        while(choice != 0){
            System.out.println("====================================");
            JanjiTemu currJt = listJanjiTemuAktif.get(index);
            currJt.getDetail();
            System.out.println(currJt.getStatusPersetujuan());
            System.out.println("====================================");

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Selanjutnya");
            System.out.println("2. Sebelumnya");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 


            switch (choice) {
                case 0:
                    break;
                case 1:
                    if(index < listJanjiTemuAktif.size() - 1){
                        index++;
                    }                    
                    break;
                case 2:
                    if(index > 0){
                        index--;
                    }
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //need fix, same with the dokter one, 
    public void listJanjiTemuPending(){

        int choice = 1;
        int index = 0;

        List<JanjiTemu> listJanjiTemuPending = Global.getFilteredJanjiTemuPending(getId());

        if(listJanjiTemuPending.isEmpty()){
            System.out.println("Tidak ada janji temu yang belum disetujui");
            return;
        }

        while(choice != 0){
            System.out.println("====================================");
            JanjiTemu currJt = listJanjiTemuPending.get(index);
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
                    if(index < listJanjiTemuPending.size() - 1){
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


    public void editPasien(){
        int choice = 1;
        while (choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Nama");
            System.out.println("2. Edit Umur");
            System.out.println("3. Edit Jenis Kelamin");
            System.out.println("4. Edit Alamat");
            System.out.println("5. Edit Nomor Kontak");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();
            
            String inputBaru = "";
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Masukan Nama Baru: ");
                    inputBaru = Global.scanner.nextLine();
                    setNama(inputBaru);
                    System.out.println("Nama berhasil diubah menjadi " + getNama());
                    break;
                case 2:
                    System.out.print("Masukan Umur Baru: ");
                    inputBaru = Global.scanner.nextLine();
                    try{
                        int umurBaru = Integer.parseInt(inputBaru);
                        setUmur(umurBaru);
                        System.out.print("Umur berhasil diubah menjadi " + getUmur());
                    } catch (NumberFormatException e) {
                        System.out.println("Input umur tidak valid. Pastikan memasukkan angka.");
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.print("Masukkan jenis kelamin baru (Laki Laki/Perempuan): ");
                        inputBaru = Global.scanner.nextLine();
                        if (inputBaru.equalsIgnoreCase("Laki Laki") || inputBaru.equalsIgnoreCase("Perempuan")) {
                            setJenisKelamin(inputBaru);
                            System.out.print("Jenis kelamin berhasil diubah menjadi " + getJenisKelamin());
                            break;
                        } else {
                            System.out.println("Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukan alamat baru: ");
                    inputBaru = Global.scanner.nextLine();
                    setAlamat(inputBaru);
                    System.out.println("Nama berhasil diubah menjadi " + getAlamat());
                    break;
                case 5:
                    System.out.print("Masukan nomor kontak baru: ");
                    inputBaru = Global.scanner.nextLine();
                    setNomorKontak(inputBaru);
                    System.out.println("Nama berhasil diubah menjadi " + getNomorKontak());
                    break;
                case 6:
                    System.out.print("Masukan riwayat medis Baru: ");
                    inputBaru = Global.scanner.nextLine();
                    setRiwayatMedis(inputBaru);
                    System.out.println("Riwayat medis berhasil diubah menjadi " + riwayatMedis);
                    break;

                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //TODO: Error handling
    public void editKeadaanPasien(){
        System.out.println("Keadaan Pasien saat ini: " + kondisiSaatIni);
        System.out.print("Silahkan input kondisi pasien yang terbaru: ");
        String kondisiBaru = Global.scanner.nextLine();

        setKondisiSaatIni(kondisiBaru);
    }


}
