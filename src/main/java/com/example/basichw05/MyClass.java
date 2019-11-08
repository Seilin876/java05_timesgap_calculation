package com.example.basichw05;


import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        ChangeSec changeSec = new ChangeSec();
        int Time1,Time2,TimeD;
        Time1 = changeSec.getTotal(1);
        Time2 = changeSec.getTotal(2);
        TimeD=Math.abs(Time1-Time2);

        System.out.printf("time1 Subtract time2 is %d sec",TimeD);
    }
}