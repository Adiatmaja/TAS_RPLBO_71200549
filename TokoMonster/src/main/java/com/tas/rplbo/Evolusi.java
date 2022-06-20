package com.tas.rplbo;

public class Evolusi extends Monster{
    private Monster monster1;
    private Monster monster2;

    public Evolusi(Monster monster1, Monster monster2){
        super(monster1.getNama() + " " + monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public String bersuara(){
        String nama = "";
        String[] suara1 = monster1.bersuara().split("");
        String[] suara2 = monster1.bersuara().split("");
        for (int i = 0; i <= 7; i++){
            if (i % 2 != 0){
                nama = nama + suara1[i];
            } else {
                nama = nama + suara2[i];
            }
        }
        return nama;
    }

    public String bergerak(){
        return monster1.getNama() + " " + monster2.getNama() + " " + monster2.bergerak() + "...";
    }
}
