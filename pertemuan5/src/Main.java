public class Main {
    public static void main(String[] args) {
        // Data Mahasiswa dengan Jenis Kelamin
        Mahasiswa[] mahasiswa = {
                new Mahasiswa("231511033", "Ahmad", "Laki-laki"),
                new Mahasiswa("231511034", "Alanna", "Perempuan"),
                new Mahasiswa("231511035", "Alya", "Perempuan"),
                new Mahasiswa("231511036", "Azka", "Laki-laki"),
                new Mahasiswa("231511037", "Bandyaga", "Laki-laki"),
                new Mahasiswa("231511038", "Daffa", "Laki-laki"),
                new Mahasiswa("231511039", "Daiva", "Laki-laki"),
                new Mahasiswa("231511040", "Dhea", "Perempuan"),
                new Mahasiswa("231511042", "Dhira", "Perempuan"),
                new Mahasiswa("231511043", "Dwika", "Laki-laki")
        };

        // Data Dosen dengan Jenis Kelamin
        Dosen[] dosen = {
                new Dosen("KO013N", "Yudi Widhiyasana", "Laki-laki"),
                new Dosen("KO009N", "Santi Sundari", "Perempuan"),
                new Dosen("KO078N", "Trisna Gelar", "Laki-laki"),
                new Dosen("KO060N", "Ade Hodijah", "Perempuan"),
                new Dosen("KO074N", "Muhammad Rizqi", "Laki-laki"),
                new Dosen("KO003N", "Bambang Wisnuadhi", "Laki-laki"),
                new Dosen("KO001N", "Ade Chandra", "Laki-laki"),
                new Dosen("KO061N", "Zulkifli Arsyad", "Laki-laki"),
                new Dosen("KO075N", "Siti Dwi Setiarini", "Perempuan"),
                new Dosen("KO052N", "Yadhi Aditya", "Laki-laki")
        };

        // Jadwal Kuliah dengan informasi dosen pengampu
        Jadwal[] jadwalKuliah = {
                new Jadwal("Komputer Grafik (TE)", "Senin", "D105", "08:40-10:40", "Yudi Widhiyasana"),
                new Jadwal("Pengantar Rekayasa Perangkat Lunak (TE)", "Senin", "D105", "10:40-12:20", "Santi Sundari"),
                new Jadwal("Komputer Grafik (PR)", "Senin", "D105", "13:00-15:30", "Trisna Gelar"),
                new Jadwal("Basis Data", "Selasa", "D106", "07:00-12:20", "Ade Hodijah"),
                new Jadwal("Aljabar Linear", "Selasa", "D101", "13:00-14:40", "Muhammad Rizqi"),
                new Jadwal("Proyek 3", "Rabu", "D116", "07:00-16:40", "Bambang Wisnuadhi"),
                new Jadwal("Basis Data", "Kamis", "D105", "07:00-08:40", "Ade Chandra"),
                new Jadwal("Pemrograman Berorientasi Objek (TE)", "Kamis", "D105", "08:40-10:40", "Zulkifli Arsyad"),
                new Jadwal("Pemrograman Berorientasi Objek (PR)", "Kamis", "D116", "10:40-13:50", "Zulkifli Arsyad"),
                new Jadwal("Matematika Diskrit II", "Kamis", "D108", "13:50-16:40", "Siti Dwi Setiarini"),
                new Jadwal("Pengantar Rekayasa Perangkat Lunak (PR)", "Jumat", "D116", "07:50-14:40", "Yadhi Aditya")
        };

        // Tampilkan Data Mahasiswa
        System.out.println("Data Mahasiswa:");
        System.out.printf("%-12s | %-15s | %-12s\n", "NIM", "Nama", "Jenis Kelamin");
        System.out.println("-----------------------------------------------");
        for (Mahasiswa mhs : mahasiswa) {
            System.out.printf("%-12s | %-15s | %-12s\n", mhs.getId(), mhs.getNama(), mhs.getJenisKelamin());
        }

        // Tampilkan Data Dosen
        System.out.println("\nData Dosen:");
        System.out.printf("%-12s | %-20s | %-12s\n", "Kode Dosen", "Nama", "Jenis Kelamin");
        System.out.println("-------------------------------------------------------------");
        for (Dosen dsn : dosen) {
            System.out.printf("%-12s | %-20s | %-12s\n", dsn.getId(), dsn.getNama(), dsn.getJenisKelamin());
        }

        // Tampilkan Jadwal Kuliah
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-40s | %-8s | %-8s | %-12s | %-20s\n", "Mata Kuliah", "Hari", "Ruangan", "Waktu", "Dosen");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (Jadwal jadwal : jadwalKuliah) {
            System.out.printf("%-40s | %-8s | %-8s | %-12s | %-20s\n",
                    jadwal.getNama(), jadwal.getHari(), jadwal.getRuangan(), jadwal.getWaktu(), jadwal.getDosen());
        }
    }
}
