public class Dosen extends SivitasAkademik {
    private String jenisKelamin;

    public Dosen(String id, String nama, String jenisKelamin) {
        super(id, nama);
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
