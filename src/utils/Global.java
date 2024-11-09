package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

import data.*;

public class Global {
    public static ArrayList<Dokter> daftarDokter = new ArrayList<>();
    public static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    public static ArrayList<Perawat> daftarPerawat = new ArrayList<>();
    public static ArrayList<Resepsionis> daftarResepsionis = new ArrayList<>();
    public static ArrayList<Ruangan> daftarRuangan = new ArrayList<>();

    public static ArrayList<JanjiTemu> daftarJanjiTemu = new ArrayList<>();

    public static HashMap<String, ArrayList<Pasien>> dokterListPasien;

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

        System.out.println("sdo");
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


    //need a better way to implement this func, good enough fo now 
    public static void jadwalkanJanjiTemu() {
        if (daftarDokter.isEmpty() || daftarPasien.isEmpty() || daftarResepsionis.isEmpty() || daftarRuangan.isEmpty()) {
            System.out.println("Pastikan semua data sudah ditambahkan terlebih dahulu (Dokter, Pasien, Resepsionis, dan Ruangan).");
            return;
        }


        Dokter dokter = daftarDokter.get(0);
        Pasien pasien = daftarPasien.get(0);
        Resepsionis resepsionis = daftarResepsionis.get(0);
        Ruangan ruangan = daftarRuangan.get(0);

        resepsionis.jadwalkanJanjiTemu(pasien, dokter);
        ruangan.tetapkanUntukPasien(pasien);

        System.out.println("Janji temu berhasil dijadwalkan antara " + pasien.getNama() + " dan " + dokter.getNama() + ".");
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
}
