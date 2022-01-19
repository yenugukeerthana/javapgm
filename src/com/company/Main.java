package com.company;

import java.util.Scanner;

public class Main {
    public static String metheo(int[] a){
        int e=0;
        int o=0;
        for(int i=0;i<a.length;i++)
        {
            int r=a[i];
            if(r%2==0)
            {
                e=e+1;
            }
            else{
                o=o+1;
            }
        }
        if(e==0){
            return "Odd";
        }
        else if(o==0){
            return "even";
        }
        else{
            return "mixed";
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int r=s.nextInt();
            a[i]=r;
        }
        System.out.println(metheo(a));

    }
}
