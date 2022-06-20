package com.tas.rplbo;

public class Barang {
    private String kode;
    private int stock;
    private static int nextNum = 1;
    private String nama;
    private long harga;

    public Barang(String nama, int stock, long harga) {
        this.nama = nama;
        this.stock = stock;
        this.harga = harga;
        String[] DaftarNama = nama.split(" ");
        for (int i = 0; i <= DaftarNama.length - 1; i++) {
            String j = DaftarNama[i];
            String huruf = j.toUpperCase();
            if (huruf.equals("KEYBOARD")) {
                this.kode = "KB00" + nextNum++;
                break;
            }else if (huruf.equals("MOUSE")) {
                this.kode = "MS00" + nextNum++;
                break;
            }else if (huruf.equals("HEADSET")){
                this.kode = "HS00" + nextNum++;
                break;
            }
        }
    }

    public void setStok(int stock) {
        this.stock = stock;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stock;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}