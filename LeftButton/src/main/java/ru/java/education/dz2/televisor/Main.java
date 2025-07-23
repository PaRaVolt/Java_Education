package ru.java.education.dz2.televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Character ch;

        while(src.hasNext()){
            ch = (char) src.next().charAt(0);
            if(ch >= 'a' && ch <= 'z')
            {
                System.out.print(ch);
                System.out.print(" - ");
                Character new_ch = find_left_char(ch);
                System.out.println(new_ch);
            }
            else
            {
                break;
            }
        }
    }

    private static Character find_left_char(Character c)
    {
        String klava = "qwertyuiopasdfghjklzxcvbnm";
        char[] mass = klava.toCharArray();
        int i;
        int ic = klava.length();
        Character res = 0;

        for(i=0;i<ic;i++){
            if(c.equals(mass[i]))
            {
                if(i > 0){
                    res = mass[i-1];
                    break;
                }
                else{
                    res = mass[ic-1];
                }
            }
        }
        return res;
    }
}