package com.kaanboldan;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

            System.out.println(
                    "Faktoriyel icin 1, \n" +
                    "Palindrom icin 2, \n" +
                    "Fibonacci icin 3,\n" +
                    "secin");
            Scanner scanner = new Scanner(System.in);
            int deger =scanner.nextInt();
            Mathematic mathematic=new Mathematic();
            if(deger==1)
            {
                    System.out.println("faktoriyeli alinacak deger giriniz.");
                    Scanner scannerFaktoriyel = new Scanner(System.in);
                    int faktoriyeldeger=scannerFaktoriyel.nextInt();
                    System.out.println(faktoriyeldeger+"!= "+
                            Mathematic.faktoriyel(faktoriyeldeger)
                    );

            }
            else if(deger==2)
            {
                    System.out.println("palindrom'u kontrol edecek kelime giriniz.");
                    Scanner scannerPalindrom = new Scanner(System.in);
                    String palindromKelime=scannerPalindrom.nextLine();
                    boolean isPalindrom=Mathematic.palindrom(palindromKelime);

                    if (isPalindrom==true)
                    {System.out.println(palindromKelime+" palindrom bir kelimedir.");}
                    else if (isPalindrom==false)
                    {System.out.println(palindromKelime+" palindrom bir kelime degildir.");}
            }
            else if (deger==3)
            {
                    Scanner scannerFibonnacci = new Scanner(System.in);
                    int fibonnacciDeger=scannerFibonnacci.nextInt();
                    System.out.println(Mathematic.fibonacci(fibonnacciDeger)
                    );
            }
            else {
                System.out.println("Gecerli bir deger girin.");
            }





    }
}
