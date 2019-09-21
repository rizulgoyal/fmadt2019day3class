package com.lambton;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringHandling {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");
        String s = String.format("%d %s %s",10,"Hello","World");
        System.out.println(s);
        String pattern = "###,###,###.##";

        DecimalFormat format = new DecimalFormat();
        format.applyPattern(pattern);

        double value = 123455678.32;
        String output = format.format(value);
        System.out.println(value + " " + pattern + " " + output);
        Scanner scanner= new Scanner(System.in);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
        LocalDateTime now =LocalDateTime.now();
        System.out.println(dtf.format(now));

        System.out.println(java.time.LocalDate.now());

        LocalDate birthdate = LocalDate.of(1993,10,22);
        LocalDate curdate = LocalDate.now();
        int years = Period.between(birthdate,curdate).getYears();
        int months = Period.between(birthdate,curdate).getMonths();
        int days = Period.between(birthdate,curdate).getDays();
        LocalTime time = LocalTime.of(17,30,00);
        LocalDate lecture = LocalDate.of(2019,09,23);
        String age = String.format("I am %d years, %d months, %d days old",years,months,days);

        System.out.println(age);










        if(s1==s4)
        {
            System.out.println("s1 == s4");
        }
        else
        {
            System.out.println(" si not = s4");
        }

        if(s1.equals(s4))
        {
            System.out.println("s1 == s4");
        }

        {
            System.out.println(" si not = s4");
        }
        System.out.println(s1);
        s1=s1.toLowerCase();
        System.out.println(s1);
        s1=s1.toUpperCase();
        System.out.println(s1);
        String collegeName = "Lambton College in Toronto";

        System.out.println(s1.charAt(0));
        System.out.println(collegeName.length());
        System.out.println(collegeName.contains("College"));
        System.out.println(collegeName.indexOf("Toronto"));
        System.out.println(collegeName.toUpperCase());
        System.out.println(collegeName.toLowerCase());
        System.out.println(collegeName.charAt(10));
        System.out.println(collegeName.replace("Toronto","New York"));
        System.out.println(collegeName.substring(11,20));
        System.out.println(collegeName.toCharArray());
        System.out.println(collegeName.concat(" 265 Yorkland Blvd., North York"));

        int a[]={1,2,3,4,5};
        int b[]= new int[]{6,7,8,9,10};
        int c[]=new int[3];
        c[0]=100;

        char c1[]= collegeName.toCharArray();
        System.out.println(c1.length);
        int cnt=0;
        char rev[]= new char[c1.length];
        for(int i=c1.length-1 ; i>=0 ;  i--)
        {
            rev[cnt++]= c1[i];
        }

        String reverse = new String(rev);




    }
}
