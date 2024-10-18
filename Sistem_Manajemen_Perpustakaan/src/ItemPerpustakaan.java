public abstract class ItemPerpustakaan {
    protected String judul;
    protected String IDitem;
    protected boolean periksa;

    public ItemPerpustakaan(String title, String itemID) {
        this.judul = title;
        this.IDitem = itemID;
        this.periksa = false;
    }

    public abstract int getPeriodePeminjaman();

    public void checkOut() {
        if (!periksa) {
            periksa = true;
            System.out.println(judul + " sudah tidak tersedia.");
        } else {
            System.out.println(judul + " baru saja dilakukan peminjaman.");
        }
    }

    public void returnItem() {
        if (periksa) {
            periksa = false;
            System.out.println(judul + " sudah dilakukan pengembalian.");
        } else {
            System.out.println(judul + " Sudah terdapat di perpustakaan.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + judul);
        System.out.println("Item ID: " + IDitem);
        System.out.println("Status: " + ( periksa ? "Checked Out" : "Available"));
        System.out.println("Loan Period: " + getPeriodePeminjaman() + " days");
    }
}