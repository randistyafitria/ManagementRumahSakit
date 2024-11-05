package utils;

import java.util.LinkedList;
import java.util.Scanner;

import data.Dokter;
import data.Pasien;
import data.Perawat;
import data.Resepsionis;
import data.Ruangan;

public class Global {
    public static LinkedList<Dokter> daftarDokter = new LinkedList<>();
    public static LinkedList<Pasien> daftarPasien = new LinkedList<>();
    public static LinkedList<Perawat> daftarPerawat = new LinkedList<>();
    public static LinkedList<Resepsionis> daftarResepsionis = new LinkedList<>();
    public static LinkedList<Ruangan> daftarRuangan = new LinkedList<>();

    public static Scanner scanner = new Scanner(System.in);

    public static void tambahDokter(LinkedList<Dokter> daftarDokter) {
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
        System.out.print("ID Dokter: ");
        String idDokter = scanner.nextLine();
        System.out.print("Spesialisasi: ");
        String spesialisasi = scanner.nextLine();
        System.out.print("Tahun Pengalaman: ");
        int tahunPengalaman = scanner.nextInt();
        scanner.nextLine();

        Dokter dokter = new Dokter(nama, umur, jenisKelamin, alamat, nomorKontak, idDokter, spesialisasi, tahunPengalaman);
        daftarDokter.add(dokter);
        System.out.println("Dokter berhasil ditambahkan.");
    }

    public static void tambahPasien(LinkedList<Pasien> daftarPasien) {
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
        System.out.print("ID Pasien: ");
        String idPasien = scanner.nextLine();
        System.out.print("Riwayat Medis: ");
        String riwayatMedis = scanner.nextLine();
        System.out.print("Kondisi Saat Ini: ");
        String kondisiSaatIni = scanner.nextLine();

        Pasien pasien = new Pasien(nama, umur, jenisKelamin, alamat, nomorKontak, idPasien, riwayatMedis, kondisiSaatIni);
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan.");
    }

    public static void tambahPerawat(LinkedList<Perawat> daftarPerawat) {
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
        System.out.print("ID Perawat: ");
        String idPerawat = scanner.nextLine();
        System.out.print("Bangsal Tugas: ");
        String bangsalTugas = scanner.nextLine();

        Perawat perawat = new Perawat(nama, umur, jenisKelamin, alamat, nomorKontak, idPerawat, bangsalTugas);
        daftarPerawat.add(perawat);
        System.out.println("Perawat berhasil ditambahkan.");
    }

    public static void tambahResepsionis(LinkedList<Resepsionis> daftarResepsionis) {
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
        System.out.print("ID Karyawan Resepsionis: ");
        String idKaryawan = scanner.nextLine();

        Resepsionis resepsionis = new Resepsionis(nama, umur, jenisKelamin, alamat, nomorKontak, idKaryawan);
        daftarResepsionis.add(resepsionis);
        System.out.println("Resepsionis berhasil ditambahkan.");
    }

    public static void tambahRuangan(LinkedList<Ruangan> daftarRuangan) {
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

    public static void jadwalkanJanjiTemu(LinkedList<Dokter> daftarDokter, LinkedList<Pasien> daftarPasien, 
                                           LinkedList<Resepsionis> daftarResepsionis, LinkedList<Ruangan> daftarRuangan) {
        if (daftarDokter.isEmpty() || daftarPasien.isEmpty() || daftarResepsionis.isEmpty() || daftarRuangan.isEmpty()) {
            System.out.println("Pastikan semua data sudah ditambahkan terlebih dahulu (Dokter, Pasien, Resepsionis, dan Ruangan).");
            return;
        }

        Dokter dokter = daftarDokter.getFirst();
        Pasien pasien = daftarPasien.getFirst();
        Resepsionis resepsionis = daftarResepsionis.getFirst();
        Ruangan ruangan = daftarRuangan.getFirst();

        resepsionis.jadwalkanJanjiTemu(pasien, dokter);
        ruangan.tetapkanUntukPasien(pasien);

        System.out.println("Janji temu berhasil dijadwalkan antara " + pasien.getNama() + " dan " + dokter.getNama() + ".");
    }
}
