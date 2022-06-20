package com.tas.rplbo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PointOfSales {
    private ArrayList<Barang> arrBarang;

    public PointOfSales() {
        arrBarang = new ArrayList<Barang>();
    }

    public void inputBarang(Barang barang) {
        arrBarang.add(barang);
    }

    public void tampilDaftarBarang() {
        System.out.println("Kode Barang\t\tNama Barang\t\t\t\tStok\tHarga");
        for (Barang barang : arrBarang) {
            System.out.print(barang.getKode() + "\t\t\t" + barang.getNama() + "\t" + barang.getStok() + "\t\tRp " + barang.getHarga());
            System.out.println("");
        }
    }

    public void checkout(HashMap<Barang, Integer> keranjang, long nominal) {
        int bill = 0;
        int change = 0;
        int a = 0;

        Iterator<Map.Entry<Barang, Integer>> iterator = keranjang.entrySet().iterator();
        if (iterator.hasNext()) {
            do {
                Map.Entry<Barang, Integer> j = iterator.next();
                bill = (int) (bill + j.getKey().getHarga() * j.getValue());
                a = a + j.getKey().getStok() - j.getValue();
                for (Barang barang : arrBarang) {
                    if (j.getKey().getNama().equals(barang.getNama())) {
                        a = barang.getStok() - j.getValue();
                        barang.setStok(a);
                    }
                }
            } while (iterator.hasNext());
        }

        System.out.println("-----Transaksi sukses!-----");
        System.out.println("Total bill: Rp " + bill);
        System.out.println("Total Bayar: Rp " + nominal);
        change = (int) (change + nominal - bill);
        System.out.println("Total change: Rp " + change);
    }
}