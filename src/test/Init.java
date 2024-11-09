package test;

import data.Dokter;
import data.Perawat;
import data.Resepsionis;
import data.Ruangan;
import data.Pasien;
import utils.Global;

public class Init {
    public static void init(){
        Global.daftarDokter.add(new Dokter("Sarah Williams", 46, "Perempuan", "Gang Ringgit Millenium 12", "91239923224", Global.generateId("DR"), "Chiropractic", 100));
        Global.daftarDokter.add(new Dokter("Michael Lee", 27, "Laki Laki", "Jalan Merdeka 7", "22627321111", Global.generateId("DR"), "General Medicine", 80));
        Global.daftarDokter.add(new Dokter("Allen Haynes", 47, "Laki Laki", "Kawasan Perumahan Indah 15", "00775235134", Global.generateId("DR"), "Pediatric Care", 68));
        Global.daftarDokter.add(new Dokter("John Doe", 51, "Laki Laki", "Gang Ringgit Millenium 12", "54345321677", Global.generateId("DR"), "General Medicine", 78));
        Global.daftarDokter.add(new Dokter("John Doe", 40, "Perempuan", "Perumahan Pahlawan 8", "79082345789", Global.generateId("DR"), "Orthopedics", 99));
        Global.daftarDokter.add(new Dokter("Mark Johnson", 27, "Perempuan", "Kawasan Perumahan Indah 15", "85111234567", Global.generateId("DR"), "Mewing", 83));
        Global.daftarDokter.add(new Dokter("Michael Lee", 25, "Laki Laki", "Perumahan Pahlawan 8", "01535829120", Global.generateId("DR"), "Pediatric Care", 68));
        Global.daftarDokter.add(new Dokter("Sophia Taylor", 50, "Laki Laki", "Kawasan Perumahan Indah 15", "78243214567", Global.generateId("DR"), "General Medicine", 61));
        Global.daftarDokter.add(new Dokter("James Clark", 39, "Laki Laki", "Jl. Harmoni Raya 9", "68605123456", Global.generateId("DR"), "Cardiology", 66));
        Global.daftarDokter.add(new Dokter("Sophia Taylor", 53, "Perempuan", "Jl. Harmoni Raya 9", "94526877990", Global.generateId("DR"), "General Medicine", 79));

        
        Global.daftarPasien.add(new Pasien("Rizky Alay", 19, "Laki-Laki", "Kepo lu", "123941014", Global.generateId("PA"), "Halusinasi", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Michael Tan", 34, "Laki-Laki", "Jl. Sejahtera No. 3", "234921233", Global.generateId("PA"), "Insomnia", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Jessica Kurnia", 45, "Perempuan", "Jl. Merdeka 5", "112839201", Global.generateId("PA"), "Migren", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Andi Pratama", 28, "Laki-Laki", "Perumahan Sumber 11", "879492013", Global.generateId("PA"), "Depresi", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Dina Rahayu", 38, "Perempuan", "Kawasan Hijau 2", "982304172", Global.generateId("PA"), "Kecemasan", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Budi Santoso", 24, "Laki-Laki", "Jl. Maju Jaya 8", "452910234", Global.generateId("PA"), "Asma", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Siti Nurhayati", 31, "Perempuan", "Kampung Sejahtera 4", "563920127", Global.generateId("PA"), "Hipertensi", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Yanto Suharto", 50, "Laki-Laki", "Jl. Anggrek No. 7", "372892304", Global.generateId("PA"), "Diabetes", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Cynthia Setiawan", 22, "Perempuan", "Perumahan Cendana 15", "893720129", Global.generateId("PA"), "Luka Bakar", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Agus Wijaya", 40, "Laki-Laki", "Jl. Raya 18", "238491023", Global.generateId("PA"), "Gastritis", "SAKIT"));
        

        // TODO: Ruangan, Resepsionis, Perawat;

        Global.daftarResepsionis.add(new Resepsionis("Rizky Sigma", 69, "Laki-Laki", "Apa", "923499242", Global.generateId("RS")));
    }
}
