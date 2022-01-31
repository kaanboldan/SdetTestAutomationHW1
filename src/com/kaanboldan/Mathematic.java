package com.kaanboldan;

public class Mathematic {

    public static int faktoriyel(int sayi){
        if (sayi >= 1)
            return sayi * faktoriyel(sayi - 1);
        else
            return 1;
    }
    public static boolean palindrom(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return palindrom(s.substring(1, s.length()-1));
        return false;
    }
    public static long fibonacci(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
