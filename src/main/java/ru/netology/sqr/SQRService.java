package ru.netology.sqr;

public class SQRService {

    public static int calculateNumberOfSguares(int args) {
        int counter = 0;
        int j;
        for (int i = 10; i <=99; i++) {
            j = i*i;
           if (j>=100 && j<=200)
               counter++;
        }
        System.out.println(counter);
        return counter;
    }
}