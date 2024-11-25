package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;

import data.*;

public class Global {
    public static List<Dokter> daftarDokter = new ArrayList<>();
    public static List<Pasien> daftarPasien = new ArrayList<>();
    public static List<Perawat> daftarPerawat = new ArrayList<>();
    public static List<Resepsionis> daftarResepsionis = new ArrayList<>();
    public static List<Ruangan> daftarRuangan = new ArrayList<>();

    public static List<JanjiTemu> janjiTemuPending = new ArrayList<>();
    public static List<JanjiTemu> janjiTemuAktif = new ArrayList<>();


    public static HashMap<String, ArrayList<Pasien>> dokterListPasien = new HashMap<>();
    public static HashMap<String, ArrayList<Pasien>> perawatListPasien = new HashMap<>();

    public static Scanner scanner = new Scanner(System.in);


    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


    public static String generateId(String code){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }


    public static void tambahDokter() {
        try {
            System.out.println("\n=== Tambah Dokter ===");

            System.out.print("Nama Dokter: ");
            String nama = scanner.nextLine();
    
            System.out.print("Umur Dokter: ");
            int umur = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Dokter: ");
            String jenisKelamin = scanner.nextLine();
    
            System.out.print("Alamat Dokter: ");
            String alamat = scanner.nextLine();
    
            System.out.print("Nomor Kontak Dokter: ");
            String nomorKontak = scanner.nextLine();

            System.out.print("Spesialisasi: ");
            String spesialisasi = scanner.nextLine();
    
            System.out.print("Tahun Pengalaman: ");
            int tahunPengalaman = scanner.nextInt();
            scanner.nextLine();
    
            Dokter dokter = new Dokter(nama, umur, jenisKelamin, alamat, nomorKontak, generateId("DR"), spesialisasi, tahunPengalaman);
            daftarDokter.add(dokter);
            System.out.println("Dokter berhasil ditambahkan.");
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }




    public static void tambahPasien() {
        try {
            System.out.println("\n=== Tambah Pasien ===");
            System.out.print("Nama Pasien: ");
            String nama = scanner.nextLine();
    
            System.out.print("Umur Pasien: ");
            int umur = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Pasien: ");
            String jenisKelamin = scanner.nextLine();
    
            System.out.print("Alamat Pasien: ");
            String alamat = scanner.nextLine();
    
            System.out.print("Nomor Kontak Pasien: ");
            String nomorKontak = scanner.nextLine();
    
            System.out.print("Riwayat Medis: ");
            String riwayatMedis = scanner.nextLine();
    
            System.out.print("Kondisi Saat Ini: ");
            String kondisiSaatIni = scanner.nextLine();
    
            Pasien pasien = new Pasien(nama, umur, jenisKelamin, alamat, nomorKontak, generateId("PA"), riwayatMedis, kondisiSaatIni);
            daftarPasien.add(pasien);
            System.out.println("Pasien berhasil ditambahkan.");
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }

    public static void tambahPerawat() {
        try {
            System.out.println("\n=== Tambah Perawat ===");

            System.out.print("Nama Perawat: ");
            String nama = scanner.nextLine();
    
            System.out.print("Umur Perawat: ");
            int umur = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Perawat: ");
            String jenisKelamin = scanner.nextLine();
    
            System.out.print("Alamat Perawat: ");
            String alamat = scanner.nextLine();
    
            System.out.print("Nomor Kontak Perawat: ");
            String nomorKontak = scanner.nextLine();
    
            System.out.print("Spesialisasi: ");
            String spesialisasi = scanner.nextLine();
    
            Perawat perawat = new Perawat(nama, umur, jenisKelamin, alamat, nomorKontak,generateId("PR"), spesialisasi);
            daftarPerawat.add(perawat);
            System.out.println("Perawat berhasil ditambahkan.");
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }

    public static void tambahResepsionis() {
        try {
            System.out.println("\n=== Tambah Resepsionis ===");

            System.out.print("Nama Resepsionis: ");
            String nama = scanner.nextLine();
    
            System.out.print("Umur Resepsionis: ");
            int umur = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Resepsionis: ");
            String jenisKelamin = scanner.nextLine();
    
            System.out.print("Alamat Resepsionis: ");
            String alamat = scanner.nextLine();
    
            System.out.print("Nomor Kontak Resepsionis: ");
            String nomorKontak = scanner.nextLine();
    
            Resepsionis resepsionis = new Resepsionis(nama, umur, jenisKelamin, alamat, nomorKontak, generateId("RP"));
            daftarResepsionis.add(resepsionis);
            System.out.println("Resepsionis berhasil ditambahkan.");
        } catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }

    public static void tambahRuangan() {

        try {
            System.out.println("\n=== Tambah Ruangan ===");
        
            System.out.print("Nomor Ruangan: ");
            int nomorRuangan = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Tipe Ruangan: ");
            String tipeRuangan = scanner.nextLine();
    
            System.out.print("Apakah ruangan tersedia? (true/false): ");
            boolean isTersedia = scanner.nextBoolean();
            scanner.nextLine();
    
            Ruangan ruangan = new Ruangan(nomorRuangan, tipeRuangan, isTersedia);
            daftarRuangan.add(ruangan);
            System.out.println("Ruangan berhasil ditambahkan.");   
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();
        }
    }

    public static Dokter searchDokter(String identifier){
        identifier = identifier.trim();
        for(Dokter d : daftarDokter){
            if(d.getNama().equals(identifier) || d.getId().equals(identifier)){
                return d;
            }
        }

        return null;
    }

    public static Perawat searchPerawat(String identifier){
        identifier = identifier.trim();
        for(Perawat p : daftarPerawat){
            if(p.getNama().equals(identifier) || p.getId().equals(identifier)){
                return p;
            }
        }

        return null;
    }

    public static Pasien searchPasien(String identifier){
        identifier = identifier.trim();

        for(Pasien p : daftarPasien){
            if(p.getNama().equals(identifier) || p.getId().equals(identifier)){
                return p;
            }
        }

        return null;
    }


    public static void jadwalkanJanjiTemu(Dokter dokter, Pasien pasien, Ruangan ruangan, Resepsionis resepsionis) {
        System.out.print("Enter a date (dd MM yyyy): ");
        
        String inputDate = scanner.nextLine();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        
        try {
            Date date = dateFormat.parse(inputDate);
            JanjiTemu janjiTemu = new JanjiTemu(generateId("JT"), date, dokter, pasien);

            System.out.println(date);
    
            resepsionis.jadwalkanJanjiTemu(pasien, dokter);
            ruangan.tetapkanUntukPasien(pasien);


            janjiTemuPending.add(janjiTemu);
    
            System.out.println("Janji temu berhasil dijadwalkan antara " + pasien.getNama() + " dan " + dokter.getNama() + ".");
        } 

        catch (Exception e) {
            System.out.println("Input invalid, pastikan gunakan dd MM yyyy.");
        }
        

    }

    public static void assignDokter(Dokter d, Pasien p){
        if(dokterListPasien.containsKey(d.getId())){
            dokterListPasien.get(d.getId()).add(p);
            System.out.println("Pasien Berhasil ditambahkan!");
            return;
        }
        dokterListPasien.put(d.getId(), new ArrayList<>());
        dokterListPasien.get(d.getId()).add(p);

        System.out.println("Pasien Berhasil di tambahkan");
    }

    public static void assignPerawat(Perawat pr, Pasien p){
        if(perawatListPasien.containsKey(pr.getId())){
            perawatListPasien.get(pr.getId()).add(p);
            System.out.println("Pasien Berhasil ditambahkan!");
            return;
        }
        perawatListPasien.put(pr.getId(), new ArrayList<>());
        perawatListPasien.get(pr.getId()).add(p);

        System.out.println("Pasien Berhasil di tambahkan");
    }

    public static List<JanjiTemu> getFilteredJanjiTemuPending(String identifier){
        //identifier is either doc id/pasien id, im lazy so i combine it hehe
        return janjiTemuPending.stream()
        .filter(jt -> jt.getPasien().getId().equals(identifier) || 
                      jt.getDokter().getId().equals(identifier))
        .collect(Collectors.toList());
    }


    public static List<JanjiTemu> getFilteredJanjiTemuAktif(String identifier){
        //identifier is either doc id/pasien id, im lazy so i combine it hehe
        return janjiTemuAktif.stream()
        .filter(jt -> jt.getPasien().getId().equals(identifier) || 
                      jt.getDokter().getId().equals(identifier))
        .collect(Collectors.toList());
    }


    //will be used soon? i think idk
    public static Dokter randomDokter(){
        if (Global.daftarDokter.isEmpty()) return null;
        Random rand = new Random();
        return Global.daftarDokter.get(rand.nextInt(Global.daftarDokter.size()));
    }

    public static Pasien randomPasien(){
        if (Global.daftarPasien.isEmpty()) return null;
        Random rand = new Random();
        return Global.daftarPasien.get(rand.nextInt(Global.daftarPasien.size()));
    }

    public static Perawat randomPerawat(){
        if (Global.daftarPerawat.isEmpty()) return null;
        Random rand = new Random();
        return Global.daftarPerawat.get(rand.nextInt(Global.daftarPerawat.size()));
    }

    public static Ruangan temukanRuanganKosong(){
        for (Ruangan ruangan : Global.daftarRuangan) {
            if (ruangan.getIsTersedia()) {
                return ruangan;
            }
        }
        return null; 
    }

    public static Date getRandomFutureDate(){
        Calendar calendar = Calendar.getInstance();
        Random rand = new Random();
        int daysToAdd = rand.nextInt(30) + 1;
        calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
        return calendar.getTime();
    }

}
