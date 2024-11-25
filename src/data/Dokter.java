package data;

import java.util.ArrayList;
import java.util.List;

import utils.Global;

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
        System.out.println("ID: " + getId());
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

    public void displayDokter(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu Aktif");
            System.out.println("3. Lihat Jadwal Janji Temu Pending");
            System.out.println("4. Kelola Pasien");
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
                case 4: 
                    listPasienDirawat();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //need fix
    //harusnya hanya tampilkan yang sesuai dengan identifiernya, yang hanya janji temu milik dokter ini
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
                    currJt.setujuJanjiTemuDokter();
                    break;
                case 4: 
                    currJt.tolakJanjiTemuDokter();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }    
    }

    public void listPasienDirawat(){
        if(Global.dokterListPasien.containsKey(getId())){
            ArrayList<Pasien> pasienList = Global.dokterListPasien.get(getId());
            int choice  = 1;
            int index = 0;
    
            if(pasienList.isEmpty()){
                System.out.println("Tidak ada pasien yang di assign ke anda");
                return;
            }
    
            while(choice != 0){
                System.out.println("====================================");
                Pasien p = pasienList.get(index);
                p.getDetail();
                System.out.println("====================================");
    
                System.out.println("====================================");
                System.out.println("0. Keluar");
                System.out.println("1. Selanjutnya");
                System.out.println("2. Sebelumnya");
                System.out.println("3. Edit Keadaan Pasien"); 
                //4 Jadwalkan Janji temu dengan pasien????? idk
                System.out.println("====================================");
                choice = Global.scanner.nextInt();
                Global.scanner.nextLine(); 
    
    
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        if(index < pasienList.size() - 1){
                            index++;
                        }                    
                        break;
                    case 2:
                        if(index > 0){
                            index--;
                        }
                        break;
                    case 3:
                        p.editKeadaanPasien();
                    default:
                        System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                        break;
                }
            }
        }
        else{
            System.out.println("Tidak ada pasien yang di assign ke anda");
        }

    }

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
            System.out.println("3. Batalkan Janji Temu");
            System.out.println("4. Reschedule Janji Temu"); // nanti aja, terakhiran kalaau ga malas
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
                case 3: 
                    currJt.batalkanJanjiTemu();
                    return;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public void editDokter(){
        int choice = 1;
        while (choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Nama");
            System.out.println("2. Edit Umur");
            System.out.println("3. Edit Jenis Kelamin");
            System.out.println("4. Edit Alamat");
            System.out.println("5. Edit Nomor Kontak");
            System.out.println("6. Edit Spesialisasi");
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
                        System.out.println("Umur berhasil diubah menjadi " + getUmur());
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
                            System.out.println("Jenis kelamin berhasil diubah menjadi " + getJenisKelamin());
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
                    System.out.println("Nomor Kontak berhasil diubah menjadi " + getNomorKontak());
                    break;
                case 6:
                    System.out.print("Masukan spesialisasi baru: ");
                    inputBaru = Global.scanner.nextLine();
                    setSpesialisasi(inputBaru);
                    System.out.println("Spesialisasi berhasil diubah menjadi " + spesialisasi);
                case 7:
                    System.out.print("Masukan tahun pengalaman baru: ");
                    inputBaru = Global.scanner.nextLine();
                    try{
                        int pengalamanBaru = Integer.parseInt(inputBaru);
                        setTahunPengalaman(pengalamanBaru);
                        System.out.println("Tahun pengalaman berhasil diubah menjadi " + tahunPengalaman);
                    } catch (NumberFormatException e) {
                        System.out.println("Input tahun pengalaman tidak valid. Pastikan memasukkan angka.");
                    }
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }
}
