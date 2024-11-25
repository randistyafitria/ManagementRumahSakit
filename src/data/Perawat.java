package data;

import java.util.ArrayList;

import utils.Global;

public class Perawat extends Orang {
    private String spesialisasi;

    public Perawat(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idPerawat, String spesialisasi) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak ,idPerawat);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi){
        this.spesialisasi = spesialisasi;
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
    }

    public void listPasienDirawat(){
        if(Global.dokterListPasien.containsKey(getId())){
            ArrayList<Pasien> pasienList = Global.perawatListPasien.get(getId());
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

}