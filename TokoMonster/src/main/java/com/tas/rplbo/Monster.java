package com.tas.rplbo;

public abstract class Monster implements MonsterInterface {
    private String nama;

    public Monster(String nama){
        this.nama = nama;
    }

    public abstract String bersuara();

    public void getInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Suara: " + bersuara());
        System.out.println("Gerak: " + bergerak());
    }

    public String getNama() {
        return nama;
    }

}
