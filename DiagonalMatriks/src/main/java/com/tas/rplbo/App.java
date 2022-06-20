package com.tas.rplbo;

import java.io.*;

public class App {
    public static void main( String[] args ) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\adi\\code\\semester 4\\ug rplbo\\TAS_RPLBO_71200549\\TAS_RPLBO_71200549\\DiagonalMatriks\\src\\main\\java\\com\\tas\\rplbo\\soal.txt"));

            String line = br.readLine();
            int n = Integer.parseInt(line);

            int i = 0;
            while (i < n) {
                int total = 0;

                line = br.readLine();
                String[] arr = line.split(" ");

                if (arr[1].equals(arr[0]) && arr.length == 2) {
                    int index = 0;

                    for (int j = 0; j < Integer.parseInt(arr[0]); j++) {
                        line = br.readLine();
                        String[] arr2 = line.split(" ");

                        total += Integer.parseInt(arr2[index]);
                        index++;
                    }

                    System.out.println(total);
                } else {
                    System.out.println("-1");
                    for (int j = Integer.parseInt(arr[0]); j > 0; j--) {
                        br.readLine();
                    }
                }
                i++;
            }
        } catch (IOException error) {
            System.out.println("File tidak ada!");
            error.printStackTrace();
        }
    }
}