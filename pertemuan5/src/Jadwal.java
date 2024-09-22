public class Jadwal {
    private String nama;
    private String hari;
    private String ruangan;
    private String waktu;
    private String dosen;  //

    public Jadwal(String nama, String hari, String ruangan, String waktu, String dosen) {
        this.nama = nama;
        this.hari = hari;
        this.ruangan = ruangan;
        this.waktu = waktu;
        this.dosen = dosen;
    }

    public String getNama() {
        return nama;
    }

    public String getHari() {
        return hari;
    }

    public String getRuangan() {
        return ruangan;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getDosen() {
        return dosen;
    }
}
