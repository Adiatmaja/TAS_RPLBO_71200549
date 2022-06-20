package com.tas.rplbo;

public class Main {
    public static void main(String[] args) {
        System.out.println("====CASE 1====");
        ListNotes listNotes = new ListNotes("myTasks");
        TextNotes textNotes = new TextNotes("dailyLife");
        System.out.println("====CASE 2====");
        try {
            textNotes.addNotes("Hallo nama saya Sczhny. ");
            textNotes.addNotes("Saya berkuliah di UKDW");
            listNotes.addNotes("beli kacang");
            listNotes.addNotes("mengerjakan laporan");
            listNotes.addNotes("beli snack");
            listNotes.addNotes(null);
        } catch (NotesException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("====CASE 3====");
        try {
            System.out.println(listNotes.findNotes("beli"));
            System.out.println(textNotes.findNotes("saya"));
        } catch (NotesException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("====CASE 4=====");
        listNotes.showNotes();
        textNotes.showNotes();
        System.out.println("====CASE 5=====");
        try {
            listNotes.saveNotes();
            textNotes.saveNotes();
        } catch (NotesException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("====CASE 6=====");
        try {
            Notes dailyLife = Notes.loadNotes("dailyLife");
            Notes myTasks = Notes.loadNotes("myTasks");
            myTasks.showNotes();
            dailyLife.showNotes();
        } catch (NotesException e) {
            throw new RuntimeException(e);
        }
    }
}

