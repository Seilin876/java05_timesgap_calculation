package com.example.basichw05;


import java.util.Scanner;

public class ChangeSec {

    private Scanner scanner = new Scanner(System.in);
    private int total,hr,min,sec = 0;

    public int getTotal(int i){
        System.out.printf("enter the hour of time%d\n",i);
        hr = scanner.nextInt();
        System.out.printf("enter the minute of time%d\n",i);
        min = scanner.nextInt();
        System.out.printf("enter the second of time%d\n",i);
        sec = scanner.nextInt();
        total=hr*3600+min*60+sec;
        return total;
    }


}