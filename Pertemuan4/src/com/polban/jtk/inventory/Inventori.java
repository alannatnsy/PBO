package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;

    // Inisialisasi barang-barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Menampilkan stok barang
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }

    // Pengadaan barang (hanya bisa menambah stok)
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);  // Menambah stok
        // barangs[0].tambahStok(-30);  // Contoh gagal menambah stok karena jumlah negatif
        showBarang();
    }

    // Main method
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}

