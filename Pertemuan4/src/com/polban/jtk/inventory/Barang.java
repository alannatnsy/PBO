package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Konstruktor
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Metode untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {  // Pastikan hanya bisa menambah
            stok += jumlah;
        } else {
            System.out.println("Jumlah tidak valid, harus lebih dari 0.");
        }
    }

    public String getNamaBarang() {
        return nama_barang;
    }
}