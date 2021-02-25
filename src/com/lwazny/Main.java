package com.lwazny;

public class Main {

    public static void main(String[] args) {
        String city = ("Columbus");
        int zipCode = (43215);
        double[] highTemp = {32, 25, 27, 40, 45};
        double total = 0;

        for(int i=0; i<highTemp.length; i++){
            total = total + highTemp[i];
        }

        double average = total / highTemp.length;


        System.out.println(city);
        System.out.println(zipCode);
        System.out.println(average);

    }
}
