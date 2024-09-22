public class Mahasiswa extends SivitasAkademik {
    private String jenisKelamin;

    public Mahasiswa(String id, String nama, String jenisKelamin) {
        super(id, nama);
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
