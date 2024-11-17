package test;

import data.Dokter;
import data.JanjiTemu;
import data.Perawat;
import data.Resepsionis;
import data.Ruangan;
import data.Pasien;
import utils.Global;

import java.util.Date;

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
        Global.daftarPasien.add(new Pasien("Linda Saputra", 30, "Perempuan", "Jl. Melati 3", "347892341", Global.generateId("PA"), "Pilek", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Hendra Wijaya", 55, "Laki-Laki", "Jl. Kenanga 12", "482930123", Global.generateId("PA"), "Stroke", "KRITIS"));
        Global.daftarPasien.add(new Pasien("Fenny Cahyadi", 27, "Perempuan", "Kampung Pelangi 7", "563482910", Global.generateId("PA"), "Infeksi Kulit", "RAWAT"));
        Global.daftarPasien.add(new Pasien("Rio Agustian", 33, "Laki-Laki", "Jl. Harapan Indah", "671892304", Global.generateId("PA"), "Demam Berdarah", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Nia Amelia", 41, "Perempuan", "Perumahan Indah 9", "893472012", Global.generateId("PA"), "Osteoporosis", "RAWAT"));
        Global.daftarPasien.add(new Pasien("Tommy Pranata", 29, "Laki-Laki", "Jl. Singa 2", "328947123", Global.generateId("PA"), "Alergi", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Rina Salim", 36, "Perempuan", "Jl. Damai 4", "563490182", Global.generateId("PA"), "Hipotensi", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Zainal Arifin", 48, "Laki-Laki", "Jl. Kartini No. 11", "789341029", Global.generateId("PA"), "Gagal Ginjal", "RAWAT"));
        Global.daftarPasien.add(new Pasien("Dewi Anggraeni", 23, "Perempuan", "Komplek Pelita 8", "394871024", Global.generateId("PA"), "Skoliosis", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Ahmad Ramadhan", 39, "Laki-Laki", "Jl. Flamboyan 6", "982374920", Global.generateId("PA"), "Tifus", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Ratna Kurniawati", 44, "Perempuan", "Perumahan Harmoni 3", "893401234", Global.generateId("PA"), "Tumor Jinak", "RAWAT"));
        Global.daftarPasien.add(new Pasien("Firman Saputro", 37, "Laki-Laki", "Jl. Mawar 10", "781230192", Global.generateId("PA"), "Patah Tulang", "KRITIS"));
        Global.daftarPasien.add(new Pasien("Laila Shabrina", 32, "Perempuan", "Jl. Semangka 7", "893410238", Global.generateId("PA"), "Vertigo", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Haris Kurniawan", 28, "Laki-Laki", "Komplek Anggun 5", "894120384", Global.generateId("PA"), "Asam Lambung", "RAWAT"));
        Global.daftarPasien.add(new Pasien("Indah Purnama", 26, "Perempuan", "Jl. Permata 3", "347901284", Global.generateId("PA"), "Epilepsi", "RAWAT"));
        Global.daftarPasien.add(new Pasien("Yusuf Hakim", 47, "Laki-Laki", "Kampung Damai 1", "672910384", Global.generateId("PA"), "Katarak", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Melati Anggita", 25, "Perempuan", "Jl. Sumber Baru 6", "123874920", Global.generateId("PA"), "Sinusitis", "SAKIT"));
        Global.daftarPasien.add(new Pasien("Teguh Pratomo", 31, "Laki-Laki", "Jl. Delima 14", "982374561", Global.generateId("PA"), "Hepatitis A", "KRITIS"));
        Global.daftarPasien.add(new Pasien("Nadya Ismail", 43, "Perempuan", "Jl. Lestari 2", "789320491", Global.generateId("PA"), "Kolesterol Tinggi", "SEMBUH"));
        Global.daftarPasien.add(new Pasien("Ardi Prawira", 34, "Laki-Laki", "Jl. Bahagia 5", "893710284", Global.generateId("PA"), "Bronkitis", "RAWAT"));
        
        


        Global.daftarResepsionis.add(new Resepsionis("Rizky Sigma", 69, "Laki-Laki", "Apa", "923499242", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Nadia Arifin", 34, "Perempuan", "Apa", "923481234", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Andi Pratama", 45, "Laki-Laki", "Apa", "923492345", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Siti Nurhaliza", 28, "Perempuan", "Apa", "923493456", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Dimas Wijaya", 31, "Laki-Laki", "Apa", "923494567", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Indah Putri", 26, "Perempuan", "Apa", "923495678", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Budi Santoso", 50, "Laki-Laki", "Apa", "923496789", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Fitriani Puspita", 22, "Perempuan", "Apa", "923497890", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Agus Saputra", 40, "Laki-Laki", "Apa", "923498901", Global.generateId("RS")));
        Global.daftarResepsionis.add(new Resepsionis("Nurul Hidayah", 29, "Perempuan", "Apa", "923499012", Global.generateId("RS")));


        
        Global.daftarRuangan.add(new Ruangan(1, "1 Kasur", true));
        Global.daftarRuangan.add(new Ruangan(2, "2 Kasur", false));
        Global.daftarRuangan.add(new Ruangan(3, "3 Kasur", true));
        Global.daftarRuangan.add(new Ruangan(4, "1 Kasur", false));
        Global.daftarRuangan.add(new Ruangan(5, "2 Kasur", true));
        Global.daftarRuangan.add(new Ruangan(6, "3 Kasur", false));
        Global.daftarRuangan.add(new Ruangan(7, "1 Kasur", true));
        Global.daftarRuangan.add(new Ruangan(8, "2 Kasur", false));
        Global.daftarRuangan.add(new Ruangan(9, "3 Kasur", true));
        Global.daftarRuangan.add(new Ruangan(10, "1 Kasur", true));
        Global.daftarRuangan.add(new Ruangan(11, "2 Kasur", false));
        Global.daftarRuangan.add(new Ruangan(12, "3 Kasur", true));
        

        for (int i = 0; i < Global.daftarPasien.size(); i++) {
            Pasien pasien = Global.daftarPasien.get(i);
            Dokter dokter = Global.randomDokter();
            Global.assignDokter(dokter, pasien);
        }

        for (int i = 0; i < Global.daftarPasien.size(); i++) {
            Pasien pasien = Global.daftarPasien.get(i);
            Perawat perawat = Global.randomPerawat();
            if(perawat != null){
                Global.assignPerawat(perawat, pasien);
            }
        }

        for (int i = 0; i < 25; i++) {
            Pasien pasien = Global.randomPasien();
            Dokter dokter = Global.randomDokter();
            Date appointmentDate = Global.getRandomFutureDate();

            JanjiTemu janjiTemu = new JanjiTemu(Global.generateId("JT"), appointmentDate, dokter, pasien);
            Global.janjiTemuPending.add(janjiTemu);

        }


    }
}
